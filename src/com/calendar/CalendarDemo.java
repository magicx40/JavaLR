package com.calendar;

import java.util.Calendar;

/**
 * Calendar 日历类
 * get 获取
 * set 设置
 * add 添加或减去指定日历字段
 */

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //多态的形式
        System.out.println(calendar);

//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH) + 1;
//        int date = calendar.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");

        // 需求：3年前的今天
        calendar.add(Calendar.YEAR, -3);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

    }
}
