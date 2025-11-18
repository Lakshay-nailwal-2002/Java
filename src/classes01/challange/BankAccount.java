package classes01.challange;

import org.jetbrains.annotations.NotNull;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(
            @NotNull String email,
            int balance,
            @NotNull String accountNumber,
            @NotNull String name,
            @NotNull String phoneNumber
    ) throws Exception {
        validatePhoneNumber(phoneNumber);
        validateBalance(balance);
        this.email = email;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
    }

    public void depositFunds(int amt) throws Exception {
        if(amt <= 0) throw new RuntimeException("-ve or 0 deposit  not allowed");
        setBalance(balance + amt);
    }

    public void withdrawFunds(int amt) throws Exception {
        if(amt <= 0) throw new RuntimeException("-ve or 0 withdraw not allowed");
        setBalance(balance - amt);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws Exception {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    private void validatePhoneNumber(@NotNull String phoneNumber) throws Exception {
        if(phoneNumber.length() != 10) throw new Exception("Invalid Number, Length is not equal to 10");
    }

    private void validateBalance(int balance) throws Exception {
        if(balance < 0) throw new Exception("-ve balance");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) throws Exception {
        validateBalance(balance);
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
