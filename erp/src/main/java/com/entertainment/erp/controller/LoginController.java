package com.entertainment.erp.controller;

import com.entertainment.erp.domain.po.UserInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(ModelAndView mv, @RequestBody(required = false)UserInfo userInfo){
        UserInfo info = userInfo;
        mv.addObject("info",info);
        mv.setViewName("welcome");
        return mv;
    }

}
