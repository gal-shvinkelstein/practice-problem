package dsa.searching;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 6, 10};
        System.out.println(search(arr, 6));
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 4));
    }

    private static int search(int arr[], int key) {
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
