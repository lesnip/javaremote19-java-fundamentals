package Homeworks;

/**
 * Homework5c - find duplicate values in array
 */
public class Homework5c {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 7, 3, 7, 10, 1, 9};
        System.out.println("Duplicate values in array:");
        for (int y = 0; y < arr.length; y++) {
            for (int j = y + 1; j < arr.length; j++) {
                if (arr[y] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

