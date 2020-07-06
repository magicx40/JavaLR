package com.itheima_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 复制文件
 * 1.根据数据源创建字节输入流对象
 * 2.根据目的地创建字节输出流对象
 * 3.读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
 * 4.释放资源
 */
public class FISdemo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fis.txt");

        FileOutputStream fos = new FileOutputStream("./窗里窗外.txt");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
