package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Create two arrays: gasolineCars, electricCars
 * join the array
 * result : allCars
 *
 * @author helena
 */
public class ConcatArrays {
    public static void main(String[] args) {
        String[] gasolineCars = {"Audi A5", "Lambo Urus", "BMW X5", "Mercedes s500"};
        String[] electricCars = {"Tesla model3", "Nissan Leaf", "VW UP", "Ford Mustang"};
        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);

        String[] allCars2 = new String[gasolineCars.length + electricCars.length];

        for (int i = 0; i < gasolineCars.length; i++) {
           allCars2[i] = gasolineCars[i];
        }
        for (int i = 0; i < electricCars.length; i++) {
            allCars2[i + gasolineCars.length]  = electricCars[i];
        }
        System.out.println(allCars);
        System.out.println(Arrays.toString(allCars2));
    }
}
