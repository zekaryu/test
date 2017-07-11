package com.yuze.security.controller;

import com.yuze.security.model.PermissionType;
import com.yuze.security.model.RoleName;
import com.yuze.user.model.AcUserAuth;
import com.yuze.user.model.AcUserSpec;
import com.yuze.user.service.AcUserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


/**
 * Created by yuze on 2017/7/5. All rights reserved.
 */
@Controller
public class LoginController {

    @Autowired
    private AcUserService userService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid AcUserAuth userAuth, BindingResult result, Model model, HttpServletRequest request) {

        Subject subject = SecurityUtils.getSubject();
        // 已登陆则 跳到首页
        if (subject.isAuthenticated()) {
            return "redirect:/";
        }
        if (result.hasErrors()) {
            model.addAttribute("error", "参数错误！");
            return "redirect:/login";
        }
        // 身份验证
        UsernamePasswordToken token = new UsernamePasswordToken(userAuth.getIdentifier(), userAuth.getCredential());
        token.setRememberMe(true);
        try {
            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
            subject.login(token);
            // 验证成功在Session中保存用户信息
            final AcUserSpec userSpec = userService.selectByUsername(userAuth.getIdentifier());
            request.getSession().setAttribute("userInfo", userSpec);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "redirect:/login";
        }
        return "redirect:/";
    }

    /**
     * 用户登出
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        // 登出操作
        SecurityUtils.getSubject().logout();
        return "redirect:/login";
    }

    /**
     * 基于角色 标识的权限控制案例
     */
    @RequestMapping(value = "/admin")
    @ResponseBody
    @RequiresRoles(value = RoleName.ADMIN)
    public String admin() {
        return "拥有admin角色,能访问";
    }

    /**
     * 基于权限标识的权限控制案例
     */
    @RequestMapping(value = "/create")
    @ResponseBody
    @RequiresPermissions(value = PermissionType.USER_CREATE)
    public String create() {
        return "拥有user:create权限,能访问";
    }


    private Logger logger = LoggerFactory.getLogger(this.getClass());


}
