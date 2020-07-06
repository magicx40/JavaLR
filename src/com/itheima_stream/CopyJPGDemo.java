package com.itheima_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJPGDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("./mn.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("./src/mn.jpg");

        byte[] bytes = new byte[1024];
        int len;

        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();

    }
}
