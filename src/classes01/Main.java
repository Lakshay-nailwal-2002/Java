package classes01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();
        // null --> A special keyword, the variable for a type but no reference to an object
        // fields with primitive data types are never null, Java auto define values for these
        // for e.x : int, long = 0 , boolean = false , double = 0.0
        Car car1 = new Car("G-Wagon" , "ZXI" , "Brown" , 2 , true);
        car1.describeCar();
    }
}
