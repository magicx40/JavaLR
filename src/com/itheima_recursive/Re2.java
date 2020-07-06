package com.itheima_recursive;

public class Re2 {
    public static void main(String[] args) {
        // 需求：用递归求5的阶乘，并将结果在控制台输出
        // 思路：定义一个方法，用于递归求阶乘，参数是一个int类型的变量
        // 在方法内部判断该变量的值是否是1
        // 是 返回1
        // 不是返回 n*(n-1)!
        // 调用方法
        // 输出结果

        int result = jc(5);
        System.out.println("5的阶乘是：" + result);
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
