package com.itheima_stream2;

import java.io.*;

public class CopyJavaDemo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/hanzongyuan/Downloads/存储/JAVA/src/com/itheima_stream/编码表.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hanzongyuan/Downloads/存储/JAVA/src/com/itheima_stream2/Copy编码表.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
