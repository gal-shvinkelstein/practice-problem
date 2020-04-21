package dsa.sorting;

import java.util.Arrays;

/**
 * Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements
 * and then swapping their positions if they exist in the wrong order.
 * After every iteration the highest values settles down at the end of the array.
 * Hence, the next iteration need not include already sorted elements.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 2, 3, 4, 6, 1,};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int arr[]) {
        int newArray[] = Arrays.copyOf(arr, arr.length);
        int itemCount = newArray.length;
        for (int i = 0; i < itemCount; i++) {
            for (int j = 0; j < itemCount - i - 1; j++) {
                if (isLess(newArray[j], newArray[j + 1])) {
                    swap(newArray, j, j + 1);
                }
                //System.out.println(" inner " + Arrays.toString(newArray));
            }
            System.out.println(Arrays.toString(newArray));
        }
        return newArray;
    }

    private static boolean isLess(int element1, int element2) {
        return element1 > element2;
    }

    private static void swap(int arr[], int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
