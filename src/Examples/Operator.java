package Examples;

/**
 * Examples for Java operators
 *
 * @author helena
 *
 */
public class Operator {
    int i = 0;

    public static void main(String[] args) {

        //unary operators
        //post-increment

        int i = 0;
        System.out.println(i);  // 0
        System.out.println(i++);  // 0 (increment here but not used)
        i++;  // i+1 (incremented value plus another increment)
        System.out.println(i);

        //post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);
        System.out.println(++j);

        // brackets are the highest priority

        int x = i + (-j);  // x = i - j; 2-9=-7
        System.out.println(x);

        // binary operators (operator with 2 variables)
        //arithmetic operators

        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b; // * multiplication/division/% is first priority
        System.out.println(d);

        int z = i * a + (c / b) - (-j) % x; //first (-j) because unary variable comes before binary
        /*
        1. z = i * a + (c/b) + j % x;
        2. z = (c/b)
        3. i * a
        4. j % x
        5.-6. left + , then right +
         */
        System.out.println(z);

        int divide = 40 / 5; // quotient value
        System.out.println(divide);
        int modulo = 40 % 7; // reminder value
        System.out.println(modulo);


        // comparison operators ( ==, !=, <, >, >=, <=)
        // always compare the same datatype

        boolean result = divide == modulo; // 8 == 5 false
        System.out.println(result);

        boolean result2 = divide != modulo;  // 8 != (not equals) 5 true
        System.out.println(result2);

        boolean lessCheck = divide < modulo; // 8<5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo; // 8 > 5
        System.out.println(greaterCheck);

        // 8 >= 5 // true
        // 8 >= 8 // true
        // 8 <= 5 // false

        //less than or equals
        boolean lessEquals = divide <= modulo; // 8<=5 false
        System.out.println(lessEquals);

        // logical operators (&&, ||) - and, or; are used to check if it's logically true or false
        /*
        true && false = false
        false && false = false
        false && true = false
        true && true = true
         */

        boolean andCheck = (8 < 9) && (10 > 4); // if one is false the answer is false. both need to be true
        System.out.println(andCheck);

        /*
        true || true = true
        false || false = false
        true || false = true
        false || true = true
        */

        boolean orCheck = (8 > 9) || (10 > 4); //if any one of them is true, the value is true
        System.out.println(orCheck);

        float expo = 12 ^ 25; // ^ xAnd, xOr // 12 = 00001100, 25 = 00011001
        /*
        0 = 00000000
        1 = 00000001
        2 = 00000010
        3 = 00000011
        4 = 00000100
        5 = 00000101
        6 = 00000110
        7 = 00000111
        8 = 00001000
        9 = 00001001
        10 = 00001010
        11 = 00001011
        12 = 00001100
        13 = 00001101

        0 = false
        1 = true

        true ^ false = true
        false ^ true = true
        true ^ true = false
        false ^ false = false // if both false/false or true/true the answer is false

        00001100
        00011001
        --------
        00010101 = 21
        */

        System.out.println(expo);

        //assignment operators
        x = x + 1; // both are same
        x += 1;

        x = x + y;
        x += y;
        x /= y;
        x *= y;

        //ternary operators - 3 variables (?, :)
        /*  ?
            : answer = true : false
         */
        String ternary = (8 > 10) ? "Cat" : "Dog";
        System.out.println(ternary);
        // value is dog, which means the value is false

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lessCheck ? 9 : 10;
        System.out.println(check2);

        //number comparison - always compare the same datatypes, cant be number/word
        boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);

        //mostly used operators in real world
        // ++, --
        // +
        // ==, !=
        //&&, ||
        // ?, :


    }

}
