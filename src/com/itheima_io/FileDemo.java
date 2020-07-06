package com.itheima_io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\itcast\\java.txt");
        System.out.println(file);
        File file1 = new File("E:\\itcast", "java.txt");
        System.out.println(file1);
        File file2 = new File("E:\\itcast");
        File file3 = new File(file2, "java.txt");
        System.out.println(file3);
    }
}
