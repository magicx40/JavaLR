package com.itheima_abs_class_3;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.setName("jafei");
        animal.setAge(15);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();

        animal = new Cat("加菲",5);
        System.out.println(animal.getName() + "," + animal.getAge());
        animal.eat();
    }
}
