package com.Itheima_Interface_eg;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王皓");
        ppp.setAge(39);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speakEnglish();
    }
}
