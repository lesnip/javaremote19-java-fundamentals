package strings;

import java.util.Scanner;

/**
 * to write a program to check if the string has another string
 * I love to write java code
 *  search for a word from the sentence, ie java
 * @author helena
 */
public class SubstringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a search word:");
        String searchWord = scanner.nextLine();

        if (sentence.contains(searchWord)) {
            System.out.println("Word matches"); // also looks for small and capital letters, if they don't match it's false
        } else {
            System.out.println("Word mismatch!");
        }
    }
}
