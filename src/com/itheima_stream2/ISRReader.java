package com.itheima_stream2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./isr.txt"));

//        int read();
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.println((char) ch);
//        }

        // 一次读取一个字符数组的数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }

        isr.close();
    }
}
