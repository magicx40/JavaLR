package com.itheima_doutai2;

public class AnimalDemo {
    /**
     * 多态的好处与弊端
     *
     * 多态的好处：提高了程序的扩展性
     *  具体体现：定义方法的时候，使用父类型作为参数，将来使用的使用，使用具体的子类型进行操作
     * 多态的弊端：不能使用子类特有功能
     *
     */
    public static void main(String[] args) {
        AnimalOperator animalOperator = new AnimalOperator();
        Cat cat = new Cat();
        animalOperator.useAnimal(cat);
    }
}
