package com.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        String[] colors = {"♣️", "♦️", "♥️", "♠️"};

        String[] numbers = {"2", "3", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                arrayList.add(color + number);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");

        Collections.shuffle(arrayList);

        ArrayList<String> lqxArray = new ArrayList<String>();
        ArrayList<String> lyArray = new ArrayList<String>();
        ArrayList<String> fqyArray = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < arrayList.size(); i++) {
            String poker = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                lqxArray.add(poker);
            } else if (i % 3 == 1) {
                lyArray.add(poker);
            } else if (i % 3 == 2) {
                fqyArray.add(poker);
            }
        }

        lookPoker("林青霞",lqxArray);
        lookPoker("柳岩",lyArray);
        lookPoker("风清扬",fqyArray);
        lookPoker("底牌",dpArray);

//        System.out.println(arrayList);
    }

    //看牌方法
    public static void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.println(name + "的牌是：");
        for (String poker : arrayList) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
