package com.yuze.common.controller;

import com.yuze.framework.controller.BaseController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by yuze on 2017/6/21.
 */
@Controller
@RequestMapping({"/"})
public class GeneralController extends BaseController {
    /**
     * Logger:日志记录器.
     * @since JDK 1.8
     */
    private static final Logger logger = LoggerFactory.getLogger(GeneralController.class);

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String goIdexPage(){
        return "index";
    }

    @RequestMapping("404")
    public String go404(HttpServletResponse response) throws FileNotFoundException {
        response.setStatus(404);
        return "404";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goLoginPage(){
        return "login";
    }
}
