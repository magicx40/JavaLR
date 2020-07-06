package com.itheima_abs_class_2;

/**
 * 抽象类不能直接实例化，但是可以通过多态的方式，通过子类实例化
 */
public abstract class Animal {
    private int age = 20;
    private final String city = "beijing";

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
//        city = "shanghai";
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}
