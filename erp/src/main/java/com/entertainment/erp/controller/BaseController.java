package com.entertainment.erp.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhi.zhang Date: 2018/4/3 Time: 14:53 Description: 基类
 */
public class BaseController {

    /**
     * Created by 张智 Date: 2018/4/3 Time: 14:55 Description: 获取HttpServletRequest对象
     */
    protected HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * Created by 张智 Date: 2018/4/3 Time: 14:55 获取HttpSession对象
     */
    protected HttpSession getSession() {
        return this.getRequest().getSession(true);
    }
}