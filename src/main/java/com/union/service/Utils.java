package com.union.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
     *截取字符
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

    /*
     *获得系统时间
     */
    public static Date getSystemDate(){
        //字符串格式转为LocalDate格式
        LocalDateTime parse = LocalDateTime.now();
        //获取时间地区ID
        ZoneId zoneId = ZoneId.systemDefault();
        //转换为当地时间
        ZonedDateTime zonedDateTime = parse.atZone(zoneId);
        //转为Date类型
        Date crruentDate = Date.from(zonedDateTime.toInstant());
        return crruentDate;
    }
}
