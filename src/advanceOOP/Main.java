package advanceOOP;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("27inch Beast" , "Acer" , 27 , "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200" , "Asus" , "v2.44" , 4 , 6 );

        PersonalComputor personalComputor = new PersonalComputor("2025" , "Dell" , monitor , motherBoard);

        personalComputor.powerUp();
    }
}
