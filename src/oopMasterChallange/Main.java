package oopMasterChallange;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Regular" , 4.00);
        burger.addTopping("BACON").addTopping("CHEESE").addTopping("MAYO");
        burger.printItem();
    }
}
