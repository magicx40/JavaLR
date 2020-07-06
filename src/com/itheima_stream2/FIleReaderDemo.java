package com.itheima_stream2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制java文件
 * 1.根据数据源创建字符输入流对象
 * 2.根据目的地创建字符输出流对象
 * 3.读写数据，复制文件
 * 4.释放资源
 */
public class FIleReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./test.java");
        FileWriter fw = new FileWriter("./copy.java");

//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}
