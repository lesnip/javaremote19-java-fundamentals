package Homework;

/**
 * homework6
 * @author helena
 */
public class Homework6 {
    public int findSecondLargestNumber(int[] inputArray) {
        int result = inputArray[0];

        for (int x : inputArray) {
            if (x > result) {
                result = x;
            }
        }

        return result;
    }
}