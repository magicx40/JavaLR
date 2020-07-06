package com.itheima_int_Str;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";

        String[] strArr = str.split(" ");
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }

        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println("result:" + sb.toString());
    }
}
