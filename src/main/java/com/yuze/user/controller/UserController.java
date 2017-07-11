package com.yuze.user.controller;

import com.yuze.framework.controller.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuze on 2017/7/7. All rights reserved.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @RequestMapping(value = "/adminuser" , method = RequestMethod.GET)
    public String userpage(){
        return "adminuser";
    }
}
