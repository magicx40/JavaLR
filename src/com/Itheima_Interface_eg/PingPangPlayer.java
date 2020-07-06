package com.Itheima_Interface_eg;

public class PingPangPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("pingpang运动员：study");
    }

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("pingpang运动员：eat");
    }

    @Override
    public void speakEnglish() {
        System.out.println("pingpang运动员说英语");
    }
}
