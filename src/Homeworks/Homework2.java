package Homeworks;

/** Homework2 - swapping two variables
 * @author helena
 */
public class Homework2 {
    public static void main(String[] args) {

        String a = "Cat";
        String b = "Frog";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
