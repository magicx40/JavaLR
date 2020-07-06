package com.itheima_stream2;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./test.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./test01.java"));

//        int ch;
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;

        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }


        osw.close();
        isr.close();

    }
}
