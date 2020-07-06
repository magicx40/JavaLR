package com.itheima_stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 换行符号 window \r\n
 *         linux  \n
 *        mac    \r
 * 追加写入
 *      public FileOutputStream(String name,boolean append)
 *      创建文件输出流以指定的名称写入文件
 *      如果第二个参数为true，则字节将写入文件的末尾而不是开头
 */
public class FOSdemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./hello.txt",true);

        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("hello".getBytes());
            fileOutputStream.write("\r".getBytes());
        }

        fileOutputStream.close();
    }
}
