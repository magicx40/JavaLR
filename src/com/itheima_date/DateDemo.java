package com.itheima_date;

import java.util.Date;


/**
 * getTime   获取从1970-01-01-00-00-00 到现在的毫秒值
 * setTime   设置时间，给的是毫秒值
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long d2 = 1000*60*60;
        Date date2 = new Date(d2);
        System.out.println(date2);

        System.out.println(date.getTime()*1.0/1000/60/60/24/365 + "year");

        long time = System.currentTimeMillis();
        date.setTime(time);
        System.out.println(date);
    }
}
