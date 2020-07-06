package com.itheima_doutai3;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat(); //向上转型
        animal.eat();

//        Cat c = new Cat();
//        c.eat();
//        c.playGame();

        Cat c = (Cat) animal; //向下转型，解决多态不能访问子类特有功能
        c.eat();
        c.playGame();

//        c = new Dog(); //狗类型不能转换为猫类型 （类型转换异常）

        Cat cc = (Cat) c;
        cc.eat();
        cc.playGame();


    }
}
