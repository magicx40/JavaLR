package com.itheima_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 构造方法
 * FileOutputStream (String name) 创建文件输出流以指定的名称写入文件
 * FileOutputStream （File file) 创建文件输出流以写入由指定的file对象表示的文件
 * <p>
 * void write(int b)  将指定的字节写入此文件输出流，一次写一个字节数据
 * void write(byte[] b) 将b.length 字节从指定的字节数组写入此文件输出流，一次写一个字节数组数据
 * void write(byte[] b, int off,int len) 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
 * 一次写一个字节数组的部分数据
 */
public class FOSdemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./fos.txt");
        // 此方法跟底层传入字符串的方法相同
//        FileOutputStream fos2 = new FileOutputStream(new File("./fos.txt"));

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);
//
//        fos.close();

        byte[] bytes = "abcde".getBytes();
//        fos.write(bytes);

        fos.write(bytes,1,3);
        fos.close();
    }
}
