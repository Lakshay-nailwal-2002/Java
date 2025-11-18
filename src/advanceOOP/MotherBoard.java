package advanceOOP;

public class MotherBoard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        super(model, manufacturer);
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String program){
        System.out.println("Program " + program + " is now loading...");
    }

}
