package com.entertainment.erp.controller;

import com.entertainment.erp.conf.ApplicationContext;
import com.entertainment.erp.conf.JsonResult;
import com.entertainment.erp.domain.po.UserInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

/**
 * Created by zhi.zhang Date: 2018/4/3 Time: 14:52 Description: 登陆操作
 */
@RequestMapping
@Controller
public class LoginController extends BaseController {

    private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    /**
     * Created by 张智
     * Date: 2018/4/11
     * Time: 17:32
     * Description: 登陆页
     */
    @RequestMapping(value = {"", "index"})
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("login");
        return mv;
    }

    /**
     * Created by 张智
     * Date: 2018/4/11
     * Time: 17:34
     * Description: 登陆操作
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult<Map<String,Object>> login(@RequestBody(required = false) UserInfo userInfo) {
        JsonResult<Map<String,Object>> result = new JsonResult<>();
        Map<String,Object> map = new HashMap<>();
        map.put("url","/toWelcome");
        result.setDataMap(map);
        return result;
    }

    /**
     * Created by 张智
     * Date: 2018/4/11
     * Time: 17:34
     * Description: 进入首页
     */
    @RequestMapping(value = "toWelcome")
    public ModelAndView toWelcome(ModelAndView mv) {
        mv.setViewName("welcome");
        return mv;
    }

}
