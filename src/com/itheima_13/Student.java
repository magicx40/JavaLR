package com.itheima_13;

/**
 * static 访问特点
 *  非静态的成员方法
 *      能访问静态的成员变量
 *      能访问非静态的成员变量
 *      能访问静态的成员方法
 *      能访问非静态的成员方法
 *
 *  静态成员方法
 *      能访问静态的成员变量
 *      能访问静态的成员方法
 *
 *
 *  总结：静态成员方法，只能访问静态成员
 */
public class Student {
    private String name = "林青霞";
    private static String university = "台湾大学";

    public void show1() {

    }

    public static void show4() {

    }
}
