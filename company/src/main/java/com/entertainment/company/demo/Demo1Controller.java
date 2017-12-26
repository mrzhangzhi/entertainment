package com.entertainment.company.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhi.zhang Date: 2017/12/25 Time: 16:34 Description:
 */
@Controller
public class Demo1Controller {

    @GetMapping(value = "demo1")
    public Object demo1(){
        return "Demo1";
    }
}
