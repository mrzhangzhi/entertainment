package com.entertainment.company.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhi.zhang Date: 2017/12/25 Time: 15:31 Description: 演示
 */
@RestController
public class DemoController {

    @Autowired
    private ConstantsDemo constantsDemo;


    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Object sayWhat(){
        return "hello world!";
    }

    @RequestMapping(value = "baiDu",method = RequestMethod.GET)
    public Object goBaiDu(){
        return "自定义参数:"+constantsDemo.getGoBaiDu()+";"+constantsDemo.getGoGuGe();
    }
}
