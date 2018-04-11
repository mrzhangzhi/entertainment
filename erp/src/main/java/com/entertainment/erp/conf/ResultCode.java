package com.entertainment.erp.conf;

/**
 * Created by 张智 Date: 2018/4/11 Time: 17:04 Description: 返回码
 */
public enum ResultCode {

    CODE_200(200,"操作成功"),
    CODE_400(400,"请求出现错误"),
    CODE_401(401,"请求参数错误"),
    CODE_403(403,"权限不足"),
    CODE_404(404,"未找到资源"),
    CODE_405(405,"请求烈性错误"),
    CODE_500(500,"系统繁忙,请稍后再试");

    private Integer key;

    private String value;

    private ResultCode(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
