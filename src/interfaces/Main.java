package interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        // all are instance of bird class
        animal.move();
        flier.fly();
        flier.land();
        flier.takeOff();
        tracked.track();
    }
}

