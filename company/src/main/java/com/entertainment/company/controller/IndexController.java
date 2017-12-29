package com.entertainment.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 张智
 * Date: 2017/12/27
 * Time: 16:18
 * Description: 登陆界面
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/index",""})
    public ModelAndView index(ModelAndView mv){
        mv.addObject("username","ABC");
        mv.setViewName("login");
        return mv;
    }
}
