package com.itheima_dateUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String format = "yyyy-MM-dd HH:mm:ss";
        String s = "2020-06-25 11:33:11";
        Date d2 = DateUtils.stringToDate(s, format);
        System.out.println(d2.toString());
    }
}
