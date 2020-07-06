package com.Itheima_Interface_eg;

public class BaskBallPlayer extends Player{
    public BaskBallPlayer() {
    }

    public BaskBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员：study");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员：eat");
    }
}
