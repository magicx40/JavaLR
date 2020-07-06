package com.itheima_11;

public class FinalDemo {
    /**
     * final 修饰局部变量
     * 变量是基本数据类型：final修饰指的是基本数据类型的数据值不能发生改变
     * 变量是引用数据类型，final修饰指的是引用数据类型的地址值不能发生改变
     *
     */
    public static void main(String[] args) {
        // final 修饰基本数据类型变量
        int age = 20;
        age = 100;
        System.out.println(age);

        // final 修饰引用类型变量， 地址不可变
        final Student s = new Student();
        s.age = 100;
        System.out.println(s.age);
//        s = new Student();  报错
    }
}
