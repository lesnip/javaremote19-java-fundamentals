package Homeworks;

/**
 * Homework5a - print all odd numbers from array
 * @author helena
 */
public class Homework5a {
    public static void main(String[] args) {
        //write a java program to print all odd numbers from an array:
        //[1, 7, 3, 10, 9]
        int o[] = {1, 7, 3, 10, 9};
        System.out.println("Odd numbers:" + " ");
        for (int i = 0; i < o.length; i++) {
            if (o[i] % 10 != 0) {
                System.out.println(o[i]);
            }
        }
    }
}
