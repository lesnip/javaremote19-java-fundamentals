package Examples;

/**
 * Examples of String
 * @author helena
 */

public class StringExample {
    public static void main(String[] args) {
        //String format
        String firstName = "Helena ";
        String lastName = "Pinsel";
        String fullName = firstName + lastName;//option 1
        String city = "Pärnu";

        System.out.println(fullName);

        fullName = firstName.concat(lastName); //option 2

        String ageString = "My age is: " + 31 + ". I live in " + city + ". My name is: " + fullName;

        System.out.println(ageString);
        String ageStringFormatted = String.format("My age is: %d. I live in %s. My name is: %s", 31, city, fullName);
        System.out.println(ageStringFormatted);
        //%d is for int and %s is for string %f is for float

        //decimal to octal converting
        // 3 * 8 pow1  + 6 * 8pow0 = 24 + 6 = 30
        // 2874 // (2*8 pow3) + (8*8 pow2) + (7 * 8 pow1) + (4 * 8pow0) = 2*512 + 8*64 + 7*8 + 4*1=
        //= 1024+512+56+4 = 1596
        //power of number = 8pow3 = 8*8*8
        //pow0, pow1, pow2, pow3, pow4 etc are running from back to front

        //StringBuilder
        //automatically joins to the same variable .append

        StringBuilder str1 = new StringBuilder("Hello!");
        StringBuilder str2 = str1.append("World");
        str1.append("I am Helena").append("Pinsel");

        System.out.println(str2);
        System.out.println(str1);

        //concat need to assign to the variable additionally
        String var1 = "Red";
        var1.concat("Yellow");

        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);

        //Equality
        // ==  this will compare memory or object reference and value
        // string.equals() this compares only the value

        String s1 = "Sibul"; //pool
        String s2 = "Sibul"; //pool
        String s3 = new String("Sibul"); //heap
        String s4 = new String("Sibul"); //heap

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s4 == s3);

        System.out.println(s1.equals(s3));

    }
}