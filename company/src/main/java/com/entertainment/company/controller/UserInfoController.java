package com.entertainment.company.controller;

import com.entertainment.company.domain.po.UserInfo;
import com.entertainment.company.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 张智
 * Date: 2017/12/27
 * Time: 16:19
 * Description: 用户数据操作相关
 */
@Controller
@RequestMapping("UserInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * Created by 张智
     * Date: 2017/12/27
     * Time: 16:09
     * Description: 注册
     */
    public Object register(@RequestBody(required = false) UserInfo userInfo){
        return 1;
    }

}
