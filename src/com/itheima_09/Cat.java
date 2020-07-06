package com.itheima_09;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
