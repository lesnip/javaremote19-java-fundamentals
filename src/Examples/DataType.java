package Examples;

/**
 * Examples of Primitive DataType
 *
 * @author helena
 */
public class DataType {
    // Primitive Data Types
    //Numbers
    //byte, short, int, long
    //mostly used int, float, boolean and string

    int a = 1;
    byte byteNumber = 120;
    long longNumber = 54545454681351L;
    short shortNumber = -32000;

    //float and double can act as integer but not vice versa
    float decimalNumber = 2.45576578833742983492394823572394923735682f;
    double doubleNumber = 3.456d;

    // int result = decimalNumber + a;
    // double result2 = doubleNumber + a;

    //Character
    char alpha = 'F';

    //boolean value is either True/False
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false; //

    /* Multi-line
    Comment
     */
    //the default value is always 0/null/false or ''
    int i; // 0

    float x; // 0.00f

    char animal; // ' '

    boolean isClassTomorrow; // false

    // Non-Primitive Data Types
    String word = "I'm a developer";
    
    Character random = 'u';
    
    Integer number = 5;
    
    Float numberSecond = 2.45F;
    
    Integer randomNumber; // null

    // Multi-declaration

    int numberOne, numberTwo, numberThree;
    String fruit = "apple", vegetable = "pumpkin", cities;


    // Scope of class variables

    private static final String CAR = "Toyota";

    public static String FOOD = "Cake";


    public static void main(String[] args) {
        int k = 0;
        Integer y = null;
        
        System.out.println(k);
        k = 10;

        System.out.println(k);

        System.out.println(y);

        String _color = "black"; //acceptable symbols in variable names are _ and $
        int $hexaNumber = 0x2A;
        float exam12_mark = 100.10f;
        String className = "sda";
        int a = 100;
        int b = 0;
        int c = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);
        k = 100;

    }


}
