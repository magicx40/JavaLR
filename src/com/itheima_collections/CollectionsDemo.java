package com.itheima_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> lsit = new ArrayList<Integer>();

        lsit.add(30);
        lsit.add(20);
        lsit.add(50);
        lsit.add(100);
        lsit.add(10);

//        Collections.sort(lsit); //生序排序
//        Collections.reverse(lsit);  // 倒序
        Collections.shuffle(lsit); //随机置换
        System.out.println(lsit);
    }
}
