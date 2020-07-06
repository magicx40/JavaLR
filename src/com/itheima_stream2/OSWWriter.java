package com.itheima_stream2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流写数据的5中方式
 * void write(int c)   写一个字符
 * void write(char[] cbuf)   写入一个字符数组
 * void write(char[] cbuf,int off,int len)    写入字符数组的一部分
 * void write(String str)      写一个字符串
 * void write(String str,int off,int len)    写一个字符串的一部分
 */
public class OSWWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./osw.txt"));

//        osw.write(97);
//        osw.flush(); //刷新流  字符流写数据，会把字符流放入缓冲区，需要刷新才能写入
//        osw.write(98);
//        osw.flush();
//        osw.close(); //释放流，先刷新

//        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f'};
////        osw.write(chs, 0, chs.length);
//        osw.write(chs, 1, 3);
//        osw.close();

//        osw.write("abcdef", 0, "abcdef".length());
        osw.write("abcdef", 1, 3);
        osw.flush();

        osw.close();
    }
}
