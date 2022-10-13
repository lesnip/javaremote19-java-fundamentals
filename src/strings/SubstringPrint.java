package strings;

/**
 * To print substring of a string
 *
 * @author helena
 */
public class SubstringPrint {
    public static void main(String[] args) {

        String s = "Estonia is a beautiful country!";
        System.out.println(s);

        System.out.println(s.substring(0, 22)); // estonia is a beautiful country
        System.out.println(s.substring(23)); //estonia is a beautiful
        System.out.println(s.substring(13, 22)); // country!
        System.out.println(s.substring(0, 13) + s.substring(23)); //estonia is a country

        System.out.println(s.substring(s.indexOf("beau")));
        System.out.println(s.startsWith("Estonia"));
    }
}
