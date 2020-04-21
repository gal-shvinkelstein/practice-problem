package com.practice.problem.hackerearth;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 2, 3, 4, 6, 1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[arr.length - i - 1] = temp;
    }
}
