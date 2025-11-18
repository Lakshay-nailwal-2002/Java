package classes01.challange;

public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount acc = new BankAccount(
                "lakshaynailwal@gmail.com" , 1000 , "LAK123" , "LakshayNailwal" , "7838131836"
        );
        System.out.println(acc);
        acc.depositFunds(100);
        System.out.println("Current Balance " + acc.getBalance());
        acc.withdrawFunds(1000);
        System.out.println("Current Balance " + acc.getBalance());
        acc.withdrawFunds(51);
        System.out.println("Current Balance " + acc.getBalance());
        // acc.setPhoneNumber(null);
        System.out.println("Phone Number " + acc.getPhoneNumber());
    }
}
