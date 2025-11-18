package classes01;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    //Encapsulation:
    // 1. Data bundling, Storing state and behaviour in same class
    // 2. Data hiding, User should get relevant details ( By using Private Access Modifier

    public void describeCar(){
        System.out.println(
                doors + "-Door "
                + model + " "
                + make + " "
                + color + " "
                + (convertible ? "Convertible" : "")
        );
    }

    // Constructor --> Used to create a valid instance of a class
    public Car() {
        // default constructor
    }

    public Car(String make, String model, String color, int doors, boolean convertible) {
        // parameterised constructor
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    // Getters & Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        // make = make ( confusing, Should this be set into private field or Parameter itself )
        // this keyword --> Gives us reference to instance object

        // Why use setter --> Gives us to way to make it controlled assignment, We can add validations
        this.make = make;
    }

}
