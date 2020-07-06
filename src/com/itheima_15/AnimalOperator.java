package com.itheima_15;

public class AnimalOperator {
    public void useAnimal(Animal animal) {
        animal.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat(); //多态
        return a;
    }
}
