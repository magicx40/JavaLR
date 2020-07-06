package com.itheima_recursive;

import java.io.File;
import java.io.IOException;

public class Re3 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/hanzongyuan/Downloads/itcast");

        getAllFilePath(srcFile);

    }
    public static void getAllFilePath(File srcFile) {
        File[] files = srcFile.listFiles();

        if(files != null) {
            for (File f : files) {
                if(f.isDirectory()) {
                    // 是目录就递归调用
                    getAllFilePath(f);
                } else {
                    // 不是，获取绝对路径输出到控制台
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
