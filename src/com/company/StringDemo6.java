package com.company;

public class StringDemo6 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append(",world").append(",nihao");

        System.out.println("stringBuilder:" + stringBuilder);

        int[] ch = {1, 2, 3};

        System.out.println("str:" + arrayToString(ch));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
