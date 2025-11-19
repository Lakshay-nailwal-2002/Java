package autoBoxingAndUnBoxing;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        bank.addCustomer("Lakshay");
        bank.addCustomer("Rohan");

        bank.addTransaction("Lakshay", 500.0);
        bank.addTransaction("Lakshay", -150.0);
        bank.addTransaction("Rohan", 2000.0);

        bank.printCustomerStatement("Lakshay");
        bank.printCustomerStatement("Rohan");
    }
}

