package autoBoxingAndUnBoxing;

import java.util.ArrayList;

public class Bank{
    private String name;
    ArrayList<Customer> customers;
    
    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
    }

    private Customer getCustomer(String name){
        for( Customer customer: customers){
            if(customer.getName().equals(name) ) return customer;
        }
        return null;
    }
    
    public void addCustomer(String customerName){
        Customer existingCustomer = getCustomer(customerName);
        if(existingCustomer != null) return;
        customers.add(new Customer(customerName));
    }

    public void addTransaction (String reciverName , double amt){
        Customer reciver = getCustomer(reciverName);
        if(reciver == null){
            throw new RuntimeException("Reciever does not exist in bank");
        }
        reciver.addTransaction(amt);
    }

    public void printCustomerStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            throw new RuntimeException("Customer does not exist in bank");
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customerName);
        System.out.println("Transactions:\n");
        for(double txn : customer.getTransactions()){
            System.out.printf("$%10.2f (%s)%n" , txn , txn < 0 ? "debit" : "credit");
        }
    }
}
