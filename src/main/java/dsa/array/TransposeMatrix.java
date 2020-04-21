package dsa.array;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr1[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        print(arr1);
        System.out.println();
        System.out.println();
        print(diffRowAndColumn(arr1));
        System.out.println();
        System.out.println();
        System.out.println("<<<<<<<   >>>>>>>");
        System.out.println();
        System.out.println();
        print(arr);
        System.out.println();
        System.out.println();
        sameRowAndColumn(arr);
        print(arr);

    }

    private static void sameRowAndColumn(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int item = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = item;
            }
        }
    }

    private static int[][] diffRowAndColumn(int[][] arr) {
        int newArray[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArray[j][i] = arr[i][j];
            }
        }
        return newArray;
    }

    private static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
