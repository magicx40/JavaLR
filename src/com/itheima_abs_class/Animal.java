package com.itheima_abs_class;

/**
 * 一个类中如果有抽象方法，那么它必须是抽象类
 * 一个抽象类中可以有正常方法
 */
public abstract class Animal {
    public abstract void eat();

    //抽象类中的带有方法体的方法，会被继承
    public void sleep() {
        System.out.println("睡觉");
    }
}
