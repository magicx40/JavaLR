package com.itheima_Math;

public class Math1 {
    /**
     * Math类的常用方法
     *
     * public static int abs(int a)    返回参数的绝对值
     * public static double ceil(double a)   返回大于或等于参数的最小double值，等于一个整数（向上取整）
     * public static double floor(double a)   返回小于或等于参数的最大double值，等于一个整数（向下取整）
     * public static int round(float a)   按照四舍五入返回最接近参数的int
     * public static int max(int a, int b) 两个数中的最大值
     * public static int min(int a, int b) 两个数中的最小值
     * public static double pow(double a, double b) 幂值运算，a的b次幂的值
     * public static double random()   返回为double的正值 [0.0,1.0)
     */
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("---------");
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil((12.56)));
        System.out.println("----------");
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor((12.56)));
        System.out.println("----------");
        System.out.println(Math.round(12.34F));
        System.out.println(Math.round((12.56F)));
        System.out.println("----------");
        System.out.println(Math.min(12,13));
        System.out.println(Math.max(34,100));
        System.out.println("----------");
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("----------");
        System.out.println(Math.random());
        System.out.println("----------");
        System.out.println((int)(Math.random()*100)); //[0,100)
    }
}
