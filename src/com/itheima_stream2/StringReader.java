package com.itheima_stream2;

import java.io.*;

/**
 * InputStreamReader  是从字节流到字符流的桥梁
 * 它读取字节，并使用指定的编码将其解码为字符
 * 它实用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 * <p>
 * <p>
 * OutputStreamReader 是从字符流到字节流的桥梁
 * 使用指定的编码将写入的字符编码为字节
 * 它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
 */
public class StringReader {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./owr.txt"), "GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("./owr.txt"), "GBK");

        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        isr.close();
    }
}
