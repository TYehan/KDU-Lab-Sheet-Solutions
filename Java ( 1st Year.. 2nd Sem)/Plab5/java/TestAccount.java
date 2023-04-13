package plab.plab5;

public class TestAccount {
    
    public static void main(String[] args) {
        Customer cus = new Customer(12, "Tharindu Yehan", 'M');
        Account acc = new Account(203040, cus, 200000);

        System.out.println("--------------------------------------------------");
        System.out.println("Account No : "+acc.getAccNo());
        System.out.println("Name       : "+acc.getCustomer());
        System.out.println("Balance    : "+ String.format("%.2f", acc.getBalance()));
        
        System.out.println("Current balance : "+ String.format("%.2f", acc.deposit()));
        System.out.println("Current balance : "+ String.format("%.2f", acc.withdraw()));
        System.out.println("--------------------------------------------------");
        System.out.println(acc);
        System.out.println("--------------------------------------------------");
        
    }
}
