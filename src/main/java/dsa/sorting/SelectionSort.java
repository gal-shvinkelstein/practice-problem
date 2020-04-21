package dsa.sorting;

import java.util.Arrays;

/**
 * The selected element of the iteration reached to its final position
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 2, 3, 4, 6, 1,};
        System.out.println(Arrays.toString(sort(arr)));
    }

    /**
     * Swap selected element at ith position with min in the remaining list in RHS
     */
    public static int[] sort(int arr[]) {
        int newArray[] = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < newArray.length; i++) {
            // Start assuming that ith position is min
            int minIndex = i;
            // Iterate in the remaining list.
            for (int j = i + 1; j < newArray.length; j++) {
                /**
                 * Check if element at the current index is smaller than the item at selected index.
                 * If yes then current index become the selected index
                 */
                if (check(newArray[minIndex], newArray[j])) {
                    minIndex = j;
                }
            }
            swap(newArray, i, minIndex);
        }
        return newArray;
    }

    private static boolean check(int element1, int element2) {
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
