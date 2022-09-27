package Homeworks;

/**
 * Homework5b - print even and off from array
 */
public class Homework5b {
    public static void main(String[] args) {
        int x[] = {1, 7, 3, 10, 9};
        System.out.println("Odd numbers:" + " ");
        for (int a = 0; a < x.length; a++) {
            if (x[a] % 10 != 0) {
                System.out.println(x[a]);
            }
        }
        System.out.println("Even numbers:" + " ");
        for (int b = 0; b < x.length; b++) {
            if (x[b] % 2 == 0) {
                System.out.println(x[b]);
            }
        }
    }
}