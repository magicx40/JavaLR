package com.company;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        String re_str = myReverse(line);

        System.out.println("反转字符串：" + re_str);
    }
    
    public static String myReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
