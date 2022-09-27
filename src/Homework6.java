/**
 * Homework6 - find second largest in array [1,7,3,10,9]
 * @author helena
 */
public class Homework6 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 10, 9};
        int result = array[0];

        for(int x : array) {
            if(x > result) {
                result = x - 1;
            }
        }
        System.out.println(result);
    }
}