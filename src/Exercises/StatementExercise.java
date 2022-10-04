package Exercises;

/**
 * Statement Exercise
 * @author helena
 */
public class StatementExercise {
    public static void main(String[] args) {

        // if
        //write a java program to find if the person is an adult (assume adult age is 18)
        int myAge = 21;
        if (myAge >= 18) {
            System.out.println("The person is an adult.");
        }

        // if else
        // write a java program to print if the given number is odd or even
        int number = 2020; //% because we have to find if the reminder value is odd or even
        if (number % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
        // if, else if, else
        //write a java program to print if the string is empty,
        //if the string lenght is greater than 20 and if the string is null

        String test = "";

        if (test == "") {
            System.out.println("The given String is empty");
        } else if (test.length() > 20) {
            System.out.println("The given String is so long");
        } else if (test.length() < 20) {
            System.out.println("The given String is too short");
        } else if (test == null) {
            System.out.println("The String cannot be null");
        }
        //switch
        //write a java progran to match the given alphabet
        char test2 = 'H';
        switch (test2) {
            case 'A':
                System.out.println("The given alphabet is A");
                break;
            case 'B':
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");
        }
        String f = "fizz";
        String b = "buzz";
        String fb = "fizzbuzz";
        int x = 0;
        for (x = 1; x <= 50; x++){
           if ((x % 3 == 0) && (x % 5 == 0)) {
            System.out.println(fb);
           } else if(x % 3 == 0) {
           System.out.println(f);
          } else if(x % 5 == 0) {
          System.out.println(b);
 }
}

   int i;
    for (i = 0; i<=20; i++) {
     if (i % 2 == 0) {
      System.out.println(i + "is even number");
   } else {
   System.out.println(i + "is odd number");
     }
    }
  for(i = 0; i <= 20; i++) {
   System.out.println(i + "is" + (i % 2 == 0 ? "even" : "odd") + "number"); // i is even/odd number
   }
  // Leap year
  int year = 2022;
    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
     System.out.println(year + " is a leap year ");
      } else {
         System.out.println(year + " is not a leap year ");
  }

   // solution 2
    System.out.println(year + " is " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : "not") + " a leap year") ;

     // solution 3
    if ( year % 4 == 0) {
       System.out.println("This is leap year");
    } else {
       System.out.println("not leap year");
   }

        // FIZZBUZZ
        // Solution 1

    int j = 10;
     if (j % 3 == 0 && j % 5 == 0) {
       System.out.println("FIZZBUZZ");
       } else if(j % 3 == 0) {
       System.out.println("FIZZ");
     }else if (j % 5 == 0) {
        System.out.println("BUZZ");
        }

    //Solution 2
    //housework3 : one line solution for FIZZBUZZ
    System.out.println(((j % 3 == 0) && ((j % 5) == 0)) ? "FIZZBUZZ" : (j % 3 == 0) ? "FIZZ" : (j % 5 == 0) ? "BUZZ" : "");
   }
}
