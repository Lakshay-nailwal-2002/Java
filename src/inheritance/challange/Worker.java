package inheritance.challange;

import java.util.Date;

public class Worker {
    private String name;
    private String birthdate;
    protected String endDate;

    public Worker() {

    }

    public Worker( String name , String birthdate ){
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthdate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
