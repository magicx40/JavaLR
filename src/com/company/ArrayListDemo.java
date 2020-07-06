package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    /**
     * arraylist methods
     * add、remove、set、get
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("JAVA");
        arrayList.add(1,"javase");
//        arrayList.add(4,"javaee");
        System.out.println("array:" + arrayList);

        arrayList.remove("hello");
        arrayList.set(1,"javascript");
        System.out.println(arrayList);
//        arrayList.get(4);
    }
}

