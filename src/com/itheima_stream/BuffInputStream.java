package com.itheima_stream;

import java.io.*;

public class BuffInputStream {

    public static void main(String[] args) throws IOException {
        /**
         * 字节缓冲流
         * BufferOutputStream: 该类实现缓冲输出流，通过设置这样的输出流，应用程序可以向底层输出流写入字节，
         * 而不必为写入的每个字节导致底层系统的调用
         *
         * BufferInputStream：创建BufferedInputStream将创建一个内部缓冲区数组，当从六种读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新甜宠，一次很多字节
         *
         * 构造方法
         * 字节缓冲区输出流：BufferedOutputStream(OutputStream out)
         * 字节缓冲区输入流：BufferedInputStream(InputStream in)
         *
         * 为什么构造方法需要的是字节流，而不是具体的文件或者路径呢？
         *
         * 字节缓冲流，仅仅提供缓冲区，而真正的读写的数据还得依靠基本的字节流对象进行操作
         *
         */
//        FileOutputStream fileOutputStream = new FileOutputStream("./fox.txt");
//        BufferedOutputStream BuffOutStream = new BufferedOutputStream(fileOutputStream);
//
//        BuffOutStream.write("hello".getBytes());
//        BuffOutStream.write("world".getBytes());
//        BuffOutStream.close();

        BufferedInputStream buffInputStream = new BufferedInputStream(new FileInputStream("./fis.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = buffInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        buffInputStream.close();
    }
}
