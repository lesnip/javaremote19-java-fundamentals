package Homework;

/**
 * homework6exercise
 * @author helena
 */
public class Homework6Exercise {
    public static void main(String[] args) {
        int[] b = {1, 7, 3, 10, 9};

        Homework6 homework6 = new Homework6();
        int result = homework6.findSecondLargestNumber(b);

        System.out.println("Finding the largest element in array..");
        System.out.println("Second largest: " + result);
    }
}