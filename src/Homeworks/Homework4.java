package Homeworks;

/**
 * Homework4 - find smallest element in array
 */
public class Homework4 {
    public static void main(String[] args) {
        int[] b = {9, 27, 40, 20, 839, 11000};
        int result2 = b[0];
        for(int x : b) {
            if(x < result2) {
                result2 = x;
            }
        }
        System.out.println(result2);
    }
}

