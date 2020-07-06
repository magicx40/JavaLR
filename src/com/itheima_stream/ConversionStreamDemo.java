package com.itheima_stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ConversionStreamDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "中国";

//        byte[] bytes = string.getBytes(); //使用平台默认字符集utf-8
//        System.out.println(Arrays.toString(bytes));

        byte[] bytes = string.getBytes("UTF-8");

//        String ss = new String(bytes, "UTF-8"); //乱码
        String ss = new String(bytes, "UTF-8");
        System.out.println(ss);
    }
}
