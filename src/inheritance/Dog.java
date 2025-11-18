package inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Labrador Retriver" , "Medium" , 50);
    }

    public Dog(String type , double weight) {
        this(type , weight , "sweep" , "bend");
    }

    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large") , weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise(){
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");
        bark();
        run();
    }

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println(" Dog Running ");
    }

    public void wagTail(){
        System.out.println(" Dog , wag tail ");
    }
}
