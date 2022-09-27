package Examples.Objects;

public class ObjectExample {
    public String name;
    public int a;
//non-parameterized constructor or normal constructor
    public ObjectExample() {
        System.out.println("Constructing Object Example..");
        name = "Helena Pinsel";
        a = 6;

    }
    //parameterized constructor
    public ObjectExample (int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }
}
