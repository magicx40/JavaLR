package com.company;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        System.out.println("反转字符串：" + reverseString(line));
    }

    public static String reverseString(String string) {
        String str = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            str += string.charAt(i);
        }
        return str;
    }
}
