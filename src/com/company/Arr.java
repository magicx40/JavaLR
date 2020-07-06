package com.company;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11};
        int max = arr2[0];
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i : arr2) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);


    }
}
