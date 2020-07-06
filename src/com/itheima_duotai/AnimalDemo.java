package com.itheima_duotai;

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal animal = new Cat();

        System.out.println(animal.age);
    }
}
