package com.itheima_for;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; //实现了iterable接口的子类，都可以成为增强for循环的目标
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("----------------");

        String[] strArray = {"hello", "world", "java"};
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("-------------------");

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s : list) {
            System.out.println(s);
        }

//        for (String s : list) {
//            if (s.equals("world")) {
//                list.add("javaee"); // 并发修改异常
//            }
//        }
    }
}
