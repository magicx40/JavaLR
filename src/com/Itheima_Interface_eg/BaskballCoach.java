package com.Itheima_Interface_eg;

public class BaskballCoach extends Coach{
    public BaskballCoach(String name, int age) {
        super(name, age);
    }

    public BaskballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
}
