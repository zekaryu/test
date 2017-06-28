package com.yuze.common.controller;

import com.yuze.framework.controller.BaseController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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

    @RequestMapping(value = "yuze",method = RequestMethod.GET)
    public String index(){
        logger.info("get index");
        return "index";
    }

    @RequestMapping("404")
    public String go404(HttpServletResponse response) throws FileNotFoundException {
        response.setStatus(404);
        BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
        String string = reader.readLine();
        return "404";
    }
}
