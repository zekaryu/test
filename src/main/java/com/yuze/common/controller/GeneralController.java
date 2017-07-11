package com.yuze.common.controller;

import com.yuze.framework.controller.BaseController;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuze on 2017/6/21.
 */
@Controller
public class GeneralController extends BaseController {
    /**
     * Logger:日志记录器.
     * @since JDK 1.8
     */
    private static final Logger logger = LoggerFactory.getLogger(GeneralController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        // 已登陆则 跳到首页
        if (subject.isAuthenticated()) {
            return "redirect:/";
        }
        return "/login";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        // 已登陆则 跳到首页
        if (subject.isAuthenticated()) {
            return "/index";
        }
        return "redirect:/login";
    }
}
