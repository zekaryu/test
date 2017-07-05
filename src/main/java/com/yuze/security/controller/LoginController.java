package com.yuze.security.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yuze on 2017/7/5. All rights reserved.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(HttpServletRequest request){
        String resultPageUrl = InternalResourceViewResolver.FORWARD_URL_PREFIX+"/";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject currentUser = SecurityUtils.getSubject();

        try {
            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
            logger.debug("对用户[" + username + "]进行登录验证..验证开始");
            currentUser.login(token);
            logger.debug("对用户[" + username + "]进行登录验证..验证通过");
            resultPageUrl = "index";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            request.setAttribute("message_login", "错误");
        }
        if (currentUser.isAuthenticated()) {
            logger.debug("用户[" + username + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
        } else {
            token.clear();
        }
        return resultPageUrl;
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
        SecurityUtils.getSubject().logout();
        return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";
    }
}
