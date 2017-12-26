package com.mrzhang;

/**
 * Created by 张智
 * Date: 2017/12/25
 * Time: 13:49
 * Description: 字符串格式化
 */
public class StringFormatUtila {

    /**
     * Created by 张智
     * Date: 2017/11/23
     * Time: 11:36
     * Description: Base64解码使用(异常需要捕获)
     */
    public static String decodeBase64(String str) throws IOException {
        String result = null;
        byte[] b;
        if (str != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            b = decoder.decodeBuffer(str);
            result = new String(b, "utf-8");

        }
        return result;
    }

}
