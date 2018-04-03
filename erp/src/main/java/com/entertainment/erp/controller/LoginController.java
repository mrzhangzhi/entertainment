package com.entertainment.erp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhi.zhang Date: 2018/4/3 Time: 14:52 Description: 登陆操作
 */
@RequestMapping
@Controller
public class LoginController extends BaseController {

    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = {"","index"})
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("login");
        return mv;
    }

}
