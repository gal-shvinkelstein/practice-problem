package dsa.sorting;

import java.util.Arrays;

/**
 * After every iteration the LHS of the array is getting sorted. This is not completely sorted but relatively sorted
 * Inserting element to its position in the sorted list
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 2, 3, 4, 6, 1,};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int arr[]) {
        int newArray[] = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < newArray.length; i++) {
            /**
             *Loop back from current index
             */
            for (int j = i; j > 0; j--) {
                /**
                 * Check if the current element is less than any of element in the left side of the list then swap
                 */
                if (check(newArray[j], newArray[j - 1])) {
                    swap(newArray, j, j - 1);
                }
            }
        }
        return newArray;
    }

    private static boolean check(int element1, int element2) {
        return element1 < element2;
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
