package com.itheima_stream2;

import com.itheima_sys.Sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {

        // 如何把字节流转换为字符流？用转换流
        // 使用字符流能不能够实现一次读取一行数据？可以
        // 但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
        // 用包装类的方法，将字符串转换为对应数据类型
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是：" + line);
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是：" + i);


        //Java官方提供的标准输入类 Scanner
        Scanner scanner = new Scanner(System.in);
    }
}
