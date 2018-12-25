package com.union.service;

public class Utils {
    /*
     * 左侧补字符
     * @param str 对象字符串
     * @param strLength 目标长度
     */
    public static String leftPadding(String str,int strLength,String sign) {
        int strLen =str.length();
        if (strLen <strLength) {
            while (strLen< strLength) {
                StringBuffer sb = new StringBuffer();
                sb.append("sign").append(str); // 左补sign
//              sb.append(str).append("0"); // 右补sign
                str= sb.toString();
                strLen= str.length();
            }
        }
        return str;
    }

    /*
     * 右侧补字符
     * @param str 对象字符串
     * @param strLength 目标长度
     */
    public static String rightPadding(String str,int strLength,String sign) {
        int strLen =str.length();
        if (strLen <strLength) {
            while (strLen< strLength) {
                StringBuffer sb = new StringBuffer();
//                sb.append("sign").append(str); // 左补sign
                sb.append(str).append("sign"); // 右补sign
                str= sb.toString();
                strLen= str.length();
            }
        }
        return str;
    }
}
