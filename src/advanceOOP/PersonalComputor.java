package advanceOOP;

public class PersonalComputor extends Product{
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputor(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200 , 50 , "yellow");
    }

    public void powerUp(){
        drawLogo();
        motherBoard.loadProgram("Mac OS");
    }

}
