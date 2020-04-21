package dsa.searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 6, 10};
        System.out.println(search(arr, 0, arr.length - 1, 5));
        System.out.println(search(arr, 0, arr.length - 1, 1));
        System.out.println(search(arr, 0, arr.length - 1, 2));
        System.out.println(search(arr, 0, arr.length - 1, 3));
        System.out.println(search(arr, 0, arr.length - 1, 10));
    }

    private static int search(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                return search(arr, mid + 1, high, key);
            } else if (arr[mid] > key) {
                return search(arr, low, mid - 1, key);
            }
        }
        return -1;
    }
}


