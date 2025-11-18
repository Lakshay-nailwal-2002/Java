package inheritance.challange;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int workingHours;
    private int extraWorkingHours;
    private boolean fired;

    public HourlyEmployee(){

    }

    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyRate) {
        super(name, birthdate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay(){
        double payCheck = hourlyRate * (workingHours + extraWorkingHours);
        workingHours = 0;
        extraWorkingHours = 0;
        return payCheck;
    }

    public void fire(){
        if(fired) return;
        terminate("2025-10-31");
        fired = true;
    }
}
