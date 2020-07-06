package com.company;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i));
        }

        StringDemo3 stringDemo3 = new StringDemo3();
        stringDemo3.characterCount();

    }

    public void characterCount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            }else if(ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("bigCount:" + bigCount);
        System.out.println("smallCount:" + smallCount);
        System.out.println("numberCount:" + numberCount);

    }


}
