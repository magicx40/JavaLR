package com.ext;

public class Fu {
    /**
     * 父类中私有private方法，子类不可重写
     */
    private void show() {
        System.out.println("Fu中show（）方法被调用");
    }

    void method() {
        System.out.println("Fu中method（）方法被调用");
    }
}
