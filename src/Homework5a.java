/**
 * Homework 5a/5b/5c
 * @author helena
 */
public class Homework5 {
    public static void main(String[] args) {
        //homework 5a:
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