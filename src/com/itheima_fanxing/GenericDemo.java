package com.itheima_fanxing;

import com.studentManger.Student;

public class GenericDemo {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("林青霞");
//        System.out.println(student.getName());

        Generic<String> generic = new Generic<String>();
        generic.setT("林青霞");
        System.out.println(generic.getT());


        Generic<Integer> generic2 = new Generic<Integer>();
        generic2.setT(130);
        System.out.println(generic.getT());

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.show("han");

        genericMethod.show(123);

        genericMethod.show(false);

        G1<String> g1 = new G1<String>();
        g1.show("林青霞");

        G1<Integer> g2 = new G1<Integer>();
        g2.show(130);
    }
}
