package com.entertainment.company.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhi.zhang Date: 2017/12/25 Time: 16:13 Description:
 */
@Component
@ConfigurationProperties(prefix = "goUrl")
public class ConstantsDemo {

    private String goBaiDu;

    private String goGuGe;

    public String getGoBaiDu() {
        return goBaiDu;
    }

    public void setGoBaiDu(String goBaiDu) {
        this.goBaiDu = goBaiDu;
    }

    public String getGoGuGe() {
        return goGuGe;
    }

    public void setGoGuGe(String goGuGe) {
        this.goGuGe = goGuGe;
    }
}
