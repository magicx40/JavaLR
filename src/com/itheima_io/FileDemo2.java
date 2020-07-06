package com.itheima_io;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/hanzongyuan/java.txt");

        System.out.println(file.createNewFile());
        System.out.println("---------------");

        File f2 = new File("/Users/hanzongyuan/JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------------");

        File f3 = new File("/Users/hanzongyuan/JavaWEB/HTML");
        System.out.println(f3.mkdirs());
        System.out.println("---------------");

        File f4 = new File("/Users/hanzongyuan/javase.txt");
        System.out.println(f4.mkdir()); // 最终创建的东西是根据你调用的方法的，此时会生成javase.txt 文件夹
        System.out.println("-----------------");

        File f5 = new File("/Users/hanzongyuan/javase.txt");
        System.out.println(f5.createNewFile());
    }
}
