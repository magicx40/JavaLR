package com.itheima_doutai4;

public class AnimalDemo {
    /**
     * 测试类
     */
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.setName("加菲猫");
        animal.setAge(12);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();

        Animal animal1 = new Dog();
        animal1.setName("帕基");
        animal1.setAge(3);
        System.out.println(animal1.getName() + "," + animal1.getAge());
        animal1.eat();
    }
}
