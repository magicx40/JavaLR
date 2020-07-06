package com.itheima_15;

/**
 * 方法的形参是抽象类名：其实需要的是该抽象类的子类对象
 * 方法的返回值是抽象类名：其实返回的是该类的子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator animalOperator = new AnimalOperator();
        Animal a = new Cat();
        animalOperator.useAnimal(a);

        Animal a2 = animalOperator.getAnimal();
        a2.eat();

    }
}
