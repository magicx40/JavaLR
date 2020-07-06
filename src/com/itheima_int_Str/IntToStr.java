package com.itheima_int_Str;

public class IntToStr {
    public static void main(String[] args) {
        int num = 100;
        String str = "" + num; //int转换为字符串
        System.out.println(str);   //常用   int => string


        int num2 = 200;
        String str2 = String.valueOf(num2);
        System.out.println(str2); //最优解    int => string


        System.out.println(Integer.valueOf(str2).intValue());  //string =>  int

        System.out.println(Integer.parseInt(str)); //最优解    //string => int

    }
}
