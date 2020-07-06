package com.itheima_stream;

import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 字节流抽象类
 *      InputStream: 这个抽象类是表示字节输入流的所有类的超类
 *      OutputStream: 这个抽象类是表示字节输出流的所有累的超类
 *      子类名特点：子类名称都是其父类名作为子类名的后缀
 *
 *      FileOutputStream: 文件输出流用于将数据写入File
 *      FileOutputStream(String name): 创建文件输出流以指定的名称写入文件
 *
 *      使用字节输出流写数据的步骤：
 *      创建字节输出流对象（调用系统功能创建文件，创建字节输出流对象，让字节输出流对象指向文件）
 *      调用字节输出流对象写数据的方法
 *      释放资源（关闭此文件输出流并释放与此流相关的系统资源）
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./fox.txt");
        /**
         * 做了3件事情：
         *  1.调用系统功能创建了文件
         *  2.创建了字节输出流对象
         *  3.让字节输出流对象指向创建好的文件
         *
         * 文件流要及时关闭，并释放系统资源
         */

        fos.write(97); // 将指定的字节写入指定的文件

        fos.close();
    }
}
