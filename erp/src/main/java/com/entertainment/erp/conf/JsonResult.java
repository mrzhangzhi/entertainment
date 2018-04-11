package com.entertainment.erp.conf;

/**
 * Created by 张智
 * Date: 2018/4/11
 * Time: 17:04
 * Description: 统一返回值
 */
public class JsonResult<T> {

    private Integer code;

    private String message;

    private T dataMap;

    public JsonResult(){
        this.code = ResultCode.CODE_200.getKey();
        this.message = ResultCode.CODE_200.getValue();
    }

    public JsonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public JsonResult(Integer code,String message,T dataMap){
        this.code = code;
        this.message = message;
        this.dataMap = dataMap;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDataMap() {
        return dataMap;
    }

    public void setDataMap(T dataMap) {
        this.dataMap = dataMap;
    }
}
