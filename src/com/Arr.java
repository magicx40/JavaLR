package com;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {12, 4, 20, 59, 17};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; i < arr.length - 1 - i; j++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println("hello,world!");
    }
    public static void arrToStr(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');

    }
}
