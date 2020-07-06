package com.itheima_list2;

import java.util.LinkedList;

public class LinkedListDemo {
    /**
     * LinkedList集合
     * <p>
     * addFirst
     * addLast
     * getFirst
     * getLast
     * removeFirst
     * removeLast
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

//        linkedList.addFirst("javase");
//        linkedList.addLast("javaee");

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println("last: " + linkedList);
    }

}
