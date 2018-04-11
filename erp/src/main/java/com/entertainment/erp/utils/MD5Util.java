package com.entertainment.erp.utils;

import com.entertainment.erp.controller.LoginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

/**
 * Created by 张智 Date: 2018/4/11 Time: 16:39 Description:MD5加密
 */
public class MD5Util {

    private static Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

    /**
     * Created by 张智
     * Date: 2018/4/11
     * Time: 16:48
     * Description: 密码加密
     */
    public static String formatPassword(String password) {
        try {
            // 获取MD5加密工具
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 加密
            byte[] digest = md.digest(password.getBytes());
            // 获取二进制十六进制互转工具
            HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
            // 将二进制数组转换为十六进制字符串
            return hexBinaryAdapter.marshal(digest);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "";
        }
    }

    /**
     * Created by 张智
     * Date: 2018/4/11
     * Time: 16:48
     * Description: 获取唯一用户标识
     */
    public static String formatUserId(String mobile, String password) {
        try {
            String str = mobile + password;
            // 获取MD5加密工具
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 加密
            byte[] digest = md.digest(str.getBytes());
            // 获取二进制十六进制互转工具
            HexBinaryAdapter hexBinaryAdapter = new HexBinaryAdapter();
            // 将二进制数组转换为十六进制字符串
            return hexBinaryAdapter.marshal(digest);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return "";
        }
    }

    public static void main(String[] args) {
          System.out.println(MD5Util.formatPassword("183560318771234567a"));
    }
}
