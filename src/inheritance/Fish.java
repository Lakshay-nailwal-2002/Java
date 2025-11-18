package inheritance;

public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(){
    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscle(){
        System.out.println(
                "Moving Muscle"
        );
    }

    private void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if(speed == "fast") moveBackFin();
    }
}
