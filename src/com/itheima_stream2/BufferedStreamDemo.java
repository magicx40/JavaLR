package com.itheima_stream2;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world");
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("./bw.txt"));

//        int ch;
//        while ((ch = br.read()) != -1) {
//            System.out.print(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
        br.close();
    }
}
