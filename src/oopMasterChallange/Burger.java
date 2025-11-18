package oopMasterChallange;

public class Burger extends Item{

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                (( extra1 == null ) ? 0 : extra1.getAdjustedPrice()) +
                (( extra2 == null ) ? 0 : extra2.getAdjustedPrice()) +
                (( extra3 == null ) ? 0 : extra3.getAdjustedPrice());
    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    private double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVACADO" , "BREAD" -> 1.0;
            case "CHEESE" , "BACON" , "WASABI" -> 1.5;
            default -> 0.0;
        };
    }

    public Burger addTopping(String extra1){
        Item newItem = new Item(extra1 , "Toppping" , getExtraPrice(extra1));
        if(this.extra1 == null ) this.extra1 = newItem;
        else if (this.extra2 == null) this.extra2 = newItem;
        else this.extra3 = newItem;
        return this;
    }

    public void printItemizedList(){
        super.printItem();
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
