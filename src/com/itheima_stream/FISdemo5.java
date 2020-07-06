package com.itheima_stream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节流读数据（一次读一个字节数据）
 * FileInputStream,从文件系统中的文件获取输入字节
 * FileInputStream(String name), 通过打开与实际文件的连接来创建一个FileInputStream，该文件由文件系统中的路径名命名
 * <p>
 * 使用字节输入流读数据的步骤
 * 1。创建字节输入流对象
 * 2。调用字节输入流对象的读数据方法
 * 3。释放资源
 */
public class FISdemo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("fis.txt");

//        int by = fileInputStream.read();
//        System.out.println(by);
//        System.out.println((char) by);

        int by;
//        while (by != -1) {
//            System.out.print((char) by);
//            by = fileInputStream.read();
//        }
        //优化
        /**
         * fileInputStream.read() 读数据
         * by = fileInputStream.read() 将读取到的数据赋值给by这个变量
         * by != -1 判断读取到的数据是否是-1
         */
        while ((by = fileInputStream.read()) != -1) {
            System.out.print((char) by);
        }

        fileInputStream.close();

    }
}
