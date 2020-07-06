package com.itheima_io;

import java.io.File;

/**
 * File类的获取和判断功能
 *
 * public boolean isDirectory
 * public boolean isFile
 * public boolean exists
 * public String getAbsolutePath
 * public String getPath
 * public String getName
 * public String[] list()
 * public File[] listFiles()
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File f = new File("/Users/hanzongyuan/Downloads/存储/工作");

        System.out.println(f.isDirectory());
        System.out.println(f.isAbsolute());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getPath());
        System.out.println(f.getName());


        System.out.println("------------");

        String[] strArr = f.list();
        for (String str : strArr) {
            System.out.println(str);
        }
        System.out.println("------------");

        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
