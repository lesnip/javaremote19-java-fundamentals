package Examples.Objects;

/**
 * Default constructor example
 * @author helena
 */

public class Traffic {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Audi Q7"; //garbage collection because car.name gets a new value below

        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Ford Mustang";

        car.name = "Toyota RAV4"; //changed the value of car.name/java reads the last one

        Car car4 = new Car(); // Car car4 = car2; because the newcar value is already named for car2
        car4 = car2;

        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);
    }
}
