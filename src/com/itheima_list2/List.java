package com.itheima_list2;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List 集合子类特点
 * List集合常用子类：ArrayList、LinkedList
 * <p>
 * ArrayList:底层数据结构是数组，查询快，增删慢
 * LinkedList:底层数据结构是链表，查询慢，增删快
 */
public class List {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        for (String s : arrayList) {
            System.out.println(s);
        }

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }


}
