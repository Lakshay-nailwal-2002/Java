package autoBoxingAndUnBoxing;

import java.util.ArrayList;

public class Customer{
    private final String name;
    ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<>();
    }

    public void addTransaction(double amt){
        transactions.add(amt); // Autoboxing
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Double> getTransactions(){
        return new ArrayList<>(transactions);
    }
}
