package com;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class itheima_Str_count {
    public static void main(String[] args) {
//        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>(); //对键进行排序
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            Integer value = treeMap.get(key);
            if (value == null) {
                treeMap.put(key, 1);
            } else {
                value++;
                treeMap.put(key, value);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        Set<Character> keySet = treeMap.keySet();
        for (Character key : keySet) {
            Integer value = treeMap.get(key);
            stringBuilder.append(key).append("(").append(value).append(")");
        }

        System.out.println(stringBuilder.toString());
    }
}
