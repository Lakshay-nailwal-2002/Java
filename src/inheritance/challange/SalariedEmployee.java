package inheritance.challange;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate, hireDate);
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(){

    }

    @Override
    public double collectPay(){
        double salary = annualSalary / 12; // pay Monthly
        return isRetired ? salary * 0.9 : salary;
    }

    public void retire(){
        if(isRetired) return;
        terminate("2025/10/31");
        isRetired = true;
    }
}
