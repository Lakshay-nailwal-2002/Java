package abstractClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("animal" , "big" , 100); Not Allowed

        Dog dog = new Dog("wolf" , 100 , "big");
        dog.makeNoise();

        doAnimalStuff(dog); // Polymorphism, At runtime java can decide what specific class methods to execute


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German shepard" , 100 , "big"));
        animals.add(new Fish("Whale" , 1000 , "big"));
        animals.add(new Dog("Labrador" , 150 , "big"));
        animals.add(new Fish("Nemo" , 10 , "small"));
        animals.add(dog);

        for ( Animal animal : animals ){
            System.out.println("-".repeat(20));
            doAnimalStuff(animal);
        }
    }

    // We can pass all the child class which extendes animal class
    private static void doAnimalStuff(Animal animal){
        animal.printInstanceName();
        animal.move("high");
        animal.makeNoise();
    }
}

