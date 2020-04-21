package dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 2, 3, 4, 6, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(int arr[], int start, int mid, int end) {
        int aux[] = new int[end - start + 1];
        int k = 0;
        int p = start;
        int q = mid + 1;
        for (int i = start; i <= end; i++) {
            /**
             * Check if first part reached at the end
             */
            if (p > mid) {
                aux[k++] = arr[q++];
            } else if (q > end) {
                /**
                 * Check if 2nd part reached at the end
                 */
                aux[k++] = arr[p++];
            } else if (arr[p] <= arr[q]) {
                /**
                 * Check if first part is smaller then take element from first part
                 */
                aux[k++] = arr[p++];
            } else {
                /**
                 * Take element from first part
                 */
                aux[k++] = arr[q++];
            }
        }
        /**
         * Put back element from AUX array into original array
         */
        for (int i = 0; i < k; i++) {
            arr[start++] = aux[i];
        }
    }

    private static void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
}
