package inheritance.challange;

public class Employee extends Worker {

    private static int employeeNo = 1;

    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthdate, String hireDate) {
        super(name, birthdate);
        this.hireDate = hireDate;
        this.employeeId = employeeNo++;
    }

    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
