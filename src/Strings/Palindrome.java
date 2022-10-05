package Strings;

import java.util.Scanner;

/**
 * To check if a given word is a palindrome /
 * @author helena
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        //MADAM - need to check all the characters from back to front - loop
        for(int i = word.length() - 1; i >= 0; i--) {
           reverseWord.append(word.charAt(i));
        }
        //equalsignorecase is used when you have lower and upper cases in a word, won't give error ie Madam, puuluuP
       if(word.equalsIgnoreCase(reverseWord.toString())) {
           System.out.println("This is a palindrome");
       } else {
           System.out.println("This is not a palindrome");
       }
    }
}
