package abstractClass;

public class Dog extends Animal{

    public Dog(String type, double weight, String size) {
        super(type, weight, size);
    }

    @Override
    public void move(String speed) {
        System.out.println("Animal " + type + " moving at " + speed + " speed");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!..");
    }
}
