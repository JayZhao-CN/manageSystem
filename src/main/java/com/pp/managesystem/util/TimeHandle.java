package com.pp.managesystem.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeHandle {

    /**
     * 获取当前时间戳
     * @return 时间戳
     */
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis()/1000;
    }

    /**
     * 根据传入的时间字符串，转换为时间戳格式
     * @param date yyyy-MM-dd HH:mm:ss格式 或 yyyy-MM-dd格式 的时间字符串
     * @return 成功：时间戳 失败：4
     */
    public static long getTimestamp(String date) {
        try {
            //首先定义待转换的时间格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //将待转换的时间字符串转换为date类型，然后使用getTime即可获取对应的时间戳
            Date dateObj = sdf.parse(date);
            //如果是Date类型的时间，直接使用date.getTime就可以获得其对应的毫秒级时间戳：
            return dateObj.getTime()/1000;
        }catch (Exception e){
            try{
                //首先定义待转换的时间格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                //将待转换的时间字符串转换为date类型，然后使用getTime即可获取对应的时间戳
                Date dateObj = sdf.parse(date);
                //如果是Date类型的时间，直接使用date.getTime就可以获得其对应的毫秒级时间戳：
                return dateObj.getTime()/1000;
            }catch (Exception exception){
                return 4L;
            }
        }
    }

    /**
     * 根据时间戳获取年月日时分秒
     * @param timestamp 时间戳10位
     * @return 返回格式为 yyyy-MM-dd HH:mm:ss 的时间字符串
     */
    public static String getTime(long timestamp){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(timestamp);
    }
}
