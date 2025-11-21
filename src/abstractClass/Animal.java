package abstractClass;

public abstract class Animal{
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, double weight, String size) {
        this.type = type;
        this.weight = weight;
        this.size = size;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    // Not possible  
    //private abstract void sleep(){}

    public void printInstanceName(){
        System.out.println(this.getClass().getSimpleName());
    }
}
