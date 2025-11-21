package abstractClass;

public class Fish extends Animal{

    public Fish(String type, double weight, String size) {
        super(type, weight, size);
    }

    @Override
    public void move(String speed) {
        System.out.println("This particular fish is moving at " + speed + " speed");
    }

    @Override
    public void makeNoise() {
        System.out.println("Scared fish....");
    }
}
