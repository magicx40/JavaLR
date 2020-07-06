package com.itheima_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 需求：字节流读文本文件数据
 *
 * 一个汉字存储：
 * 如果是GBK编码，占2个字节
 * 如果UTF-8编码，占3个字节
 *
 *
 * 汉字在存储的时候，无论采用那种编码方式，第一个字节都是负数
 */
public class FileInputStreamDemo_String {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("./fff.txt");
//
//        int by;
//        while ((by = fis.read()) != -1) {
//            System.out.println((char) by);
//        }
//
//        fis.close();

        String string = "中国";

        byte[] bytes = string.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
    }
}
