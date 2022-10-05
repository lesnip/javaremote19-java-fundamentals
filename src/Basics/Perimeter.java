package Basics;


import java.util.Scanner;

/**
 * To calculate area and perimeter of a circle
 * Area = pi r sq
 * Perimeter = 2 pi r
 *
 * @author helena
 */
public class Perimeter {
    public static void main(String[] args) {
        final float pi = 3.14f; // constant value

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        float radius = scanner.nextFloat();

        // area
        float area = pi * (radius * radius);

        // perimeter/circumference(ümbermõõt)
        float perimeter = 2 * pi * radius;

        System.out.println("Area:" + area);
        System.out.println("Perimeter" + perimeter);
    }
}
