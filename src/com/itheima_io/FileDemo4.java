package com.itheima_io;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("./java.txt");
//        System.out.println(file.createNewFile());

        // 需求2：删除当前模块目录下的java.txt
        System.out.println(file.delete());
        System.out.println("--------------");

        File file1 = new File("./itcast");
//        System.out.println(file1.mkdir());

        System.out.println(file1.delete());
        System.out.println("--------------");

        File file2 = new File("./itcast");
//        System.out.println(file2.mkdir());

        File file3 = new File("./itcast/java.txt");
//        System.out.println(file3.createNewFile());

        //删除目录：首先需要删除目录里面的内容，然后再删除目录
        System.out.println(file3.delete());
        System.out.println(file2.delete());


    }
}
