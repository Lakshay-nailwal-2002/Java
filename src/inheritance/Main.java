package inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal" , "Huge" , 400);
        doAnimalStuff(animal , "Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog , "fast");

        Dog poodle = new Dog("Poodle" , 50);
        doAnimalStuff(poodle , "slow");

        Dog labrador = new Dog("Labrador" , 60 , "test" , "longBend");
        doAnimalStuff(labrador , "fast");

        Fish goldie = new Fish("GoldFish" , 0.3 , 2 , 3);
        doAnimalStuff(goldie , "fast");
    }
    public static void doAnimalStuff(Animal animal , String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_________");
    }
}
