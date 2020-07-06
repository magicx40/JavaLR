package com.itheima_interface_2;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;
        System.out.println(i.num);
//        i.num2 = 50;
        System.out.println(i.num2);
        System.out.println(Inter.num);

    }
}
