package com.itheima_kebiancanshu;

public class ParamsC {
    public static void main(String[] args) {
        // 可变参数
        System.out.println(sum(1,2,3,4,5));
    }

    public static int sum(int b, int... a) { //a是数组；多个参数，可变参数要放最后
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
