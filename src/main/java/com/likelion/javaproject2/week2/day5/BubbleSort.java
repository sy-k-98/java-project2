package com.likelion.javaproject2.week2.day5;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                 }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
