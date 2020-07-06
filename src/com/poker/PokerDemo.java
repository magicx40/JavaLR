package com.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        String[] colors = {"♣️", "♦️", "♥️", "♠️"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        int index = 0;

        for (String s : nums) {
            for (String color : colors) {
                hashMap.put(index, color + s);
                arrayList.add(index);
                index++;
            }
        }

        hashMap.put(index, "小王");
        arrayList.add(index);
        index++;
        hashMap.put(index, "大王");
        arrayList.add(index);

        Collections.shuffle(arrayList);

        TreeSet<Integer> lqxSet = new TreeSet<Integer>();
        TreeSet<Integer> lySet = new TreeSet<Integer>();
        TreeSet<Integer> fqySet = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            int x = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                lqxSet.add(x);
            } else if (i % 3 == 1) {
                lySet.add(x);
            } else if (i % 3 == 2) {
                fqySet.add(x);
            }
        }

        lookPoker("林青霞", lqxSet, hashMap);
        lookPoker("柳岩", lySet, hashMap);
        lookPoker("风清扬", fqySet, hashMap);
        lookPoker("底牌", dpSet, hashMap);
    }

    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hs) {
        System.out.println(name + "的牌是：");

        for (Integer key : ts) {
            String poker = hs.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
