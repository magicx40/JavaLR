package com.itheima_sys;

public class Sys {
    public static void main(String[] args) {
//        System.out.println("开始");
//        public static void exit(int status);
//        System.exit(0);
//        System.out.println("结束");

//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365 + "年");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
