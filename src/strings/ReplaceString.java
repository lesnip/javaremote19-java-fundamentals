package strings;

import java.util.Scanner;

/**
 * To write a program to replace a string
 * i love java/ i like java
 * @author helena
 */
public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        
        boolean isMatching = false;
        String source = null;
        
        while(!isMatching) {
            System.out.println("Which string to replace?");
            source = scanner.nextLine();

         /*   //check case-sensitive
            if (s.contains(source)) {
                isMatching = true;
            } else {
                System.out.println("String not found! Enter again.");
            }
            */

            //check non-case sensitive
            String[] sArr = s.split(" ");
            for (String word: sArr) {
                if (word.equalsIgnoreCase(source)) {
                    isMatching = true;
                    break;
                }
            }
            if (!isMatching) {
                System.out.println("String not found! Enter again.");
            }
        }

        System.out.println("Enter the replacement string:");
        String destination = scanner.nextLine();

        String result = s.replace(source, destination); // replaces one word

       // String result = s.replaceAll("\\d", destination); // \\d : numbers
        // replaces all the same word aka Estonia/Eesti
        System.out.println(result);

    }
}
