package com.itheima_stream2;

import java.io.*;

/**
 * 字符缓冲流的特有功能
 * <p>
 * BufferedWriter
 * <p>
 * void newLine() 写一行行分隔符,行分隔符字符串由系统属性定义
 * <p>
 * String readLine() 读一行文字，结果包含行的内容的字符串，不包括任何终止字符，结果流的结尾已经到达，则为null
 */
public class BuffFeature {
    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
//
//        for (int i = 0; i < 10; i++) {
//            bw.write("hello" + i);
//            bw.newLine();
//            bw.flush();
//        }
//
//        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
//        String line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);
//
//        line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.print(line);
        }
        br.close();
    }
}
