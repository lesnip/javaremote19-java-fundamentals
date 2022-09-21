/**
 * Examples of Arrays
 * @author helena
 */
public class Array {
    public static void main(String[] args) {

        int a = 9;

        //single-dimensional array
        //array index always starts with zero
        //infinite array
        //int-array
        int[] b = {9, 27, 40, 20, 839, 11000}; //array can contain duplicates
        System.out.println(b[4]);

        //[] + {} is called array; can be written as int[](cleaner version) or int b[];
        // array can be any type(boolean, int, string, float etc)
        // [] counting starts from zero

        //string-array
        String[] fruits = {"apple", "orange", "mango",}; // index = 0, 1, 2
        System.out.println(fruits[0]); // 1st is zero, value = apple
        //System.out.println(fruits[3]); //array index out of bounds
        System.out.println(b.length); //return the number of values in the array; b=(6 numbers)
        System.out.println(b.length - 1); //returns array's last index

        //definite array
        String[] veggies = new String[5]; // new object
        //only 5 allowed, but index goes from 0 to 4

        veggies[3] = "Potato";
        veggies[4] = "Carrot";

        System.out.println(veggies[1]); //if you don't assign value, it will automatically be 0/null
        System.out.println(veggies[3]);

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];

        //processing array
        //conventional for-loop
        for(int i = 0; i < fruits.length; i++) { //i = index of array

            System.out.println(fruits[i]);
        }
        //enhanced for-loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest element in array
        //Brute-force method
        int result = b[0]; //result is 9

        for(int x: b) {
        if(x > result) {
            result = x;
            }
        }
        System.out.println(result);


        //Homework-4
        //To find the smallest element in array (b)

        int result2 = b[0];
        for(int x : b) {
            if(x < result2) {
                result2 = x;
            }
        }
        System.out.println(result2);

        //Homework-5
        //Write a java program to calculate the average value of array elements:
        //:[1, 7, 3, 10, 9]


        //Homework-6
        //Write a java program to reverse an array of integer values:
        //:[1, 7, 3, 10, 9]

    }

}
