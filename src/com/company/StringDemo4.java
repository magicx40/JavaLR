package com.company;

public class StringDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        String s = toArray(arr);

        System.out.println(s);
    }

    public static String toArray(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
              str += arr[i];
              str += ", ";
            }
        }

        str += "]";
        return str;
    }
}
