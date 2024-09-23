package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class Eclipse_Lab2_3 {

    static void getSorted(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 4, 6, 3};

        getSorted(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
