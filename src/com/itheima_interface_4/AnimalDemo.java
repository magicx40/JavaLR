package com.itheima_interface_4;

import com.itheima_interface.Jummping;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Inter j = new Cat();
        j.jump();

        Animal animal = new Cat();
        animal.setName("加菲");
        animal.setAge(5);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();


        animal = new Cat("jiafei", 5);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();
        System.out.println("______________");



    }
}
