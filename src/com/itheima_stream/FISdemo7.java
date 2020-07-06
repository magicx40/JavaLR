package com.itheima_stream;

import javax.sound.midi.SysexMessage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用字节输入流读数据的步骤
 * 1.创建字节输入流对象
 * 2.调用字节输入流对象的读数据方法
 * 3.释放资源
 */
public class FISdemo7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fis.txt");

//        byte[] bytes = new byte[5];
//
//        //第一次读数据
//        int len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        //第二次读取数据
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));
//
//        len = fis.read(bytes);  //read返回的是读取到的数据个数
//        System.out.println(len);
//        System.out.println(new String(bytes));

        byte[] bytes = new byte[1024]; //一个字节
        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes));
        }
        fis.close();
    }
}
