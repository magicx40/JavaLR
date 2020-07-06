package com.itheima_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List 有序：存储和取出位置一致
 *      可重复：插入元素可重复
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next(); //command + alt + v
            System.out.println(next);
        }
    }
}
