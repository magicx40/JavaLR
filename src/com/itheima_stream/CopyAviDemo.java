package com.itheima_stream;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        method4();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }
    //基本字节流一次读取一个字节  耗时最长 64565
    //基本字节流一次读取一个字节数组  耗时短  107
    //字节缓冲流一次读取一个字节  耗时较短 405
    //字节缓冲流一次读取一个字节数组 耗时最短 60
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/hanzongyuan/Downloads/itcast/javase/EV~2020.05.23~19.47.11.mp4");
        FileOutputStream fos = new FileOutputStream("./java.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/hanzongyuan/Downloads/itcast/javase/EV~2020.05.23~19.47.11.mp4");
        FileOutputStream fos = new FileOutputStream("./java.mp4");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/hanzongyuan/Downloads/itcast/javase/EV~2020.05.23~19.47.11.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./java.mp4"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/hanzongyuan/Downloads/itcast/javase/EV~2020.05.23~19.47.11.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./java.mp4"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }


}
