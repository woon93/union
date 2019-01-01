package com.union.service;

public class Utils {
    /*
     * 左侧补字符
     * @param str 对象字符串
     * @param strLength 目标长度
     * @param sign 要填充的字符
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
     * @param sign 要填充的字符
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

    /*
    截取字符
     */
    public static String subString(String targer, int num, String side){
        // 从左开始截取
        if("left".equals(side)){
            if(targer == null || targer.isEmpty()){
                return "";
            }
            num = (num > targer.length()-1) ? num=targer.length()-1 : num;
            return targer.substring(0,num);

        }

        return "";
    }
}
