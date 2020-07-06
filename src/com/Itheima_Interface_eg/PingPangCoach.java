package com.Itheima_Interface_eg;

public class PingPangCoach extends Coach implements SpeakEnglish{
    @Override
    public void teach() {
        System.out.println("pingpang球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜");
    }

    @Override
    public void speakEnglish() {
        System.out.println("pingpang球教练说英语");
    }
}
