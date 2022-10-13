package homework;

import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 * if given number is 4, then print:
 * 4, 44, 444, 4444, /
 *
 * @author helena
 */
public class IntegerDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) { //first loop is to print number of times/lines
            for (int j = 1; j <= i; j++) {// second loop is used to print the number of digits
                System.out.print(number);
            }
            System.out.println();
        }
    }
}