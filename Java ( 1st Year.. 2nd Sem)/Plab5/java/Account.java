package plab.plab5;

import java.util.Scanner;
public class Account {
    private int accNo;
    private Customer customer;
    private double balance = 0.0;   
   
    Scanner in =new Scanner(System.in);
    
    public Account(int accNo, Customer customer, double balance)
    {
        this.accNo = accNo;
        this.customer = customer;
        this.balance = balance;
    }
    
    public Account(int accNo, Customer customer)
    {
        this.accNo = accNo;
        this.customer =customer;
    }
        
    public int getAccNo()
    {
        return accNo;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setBalance(double d)
    {
        this.balance = 200000;
    }
    
    @Override
    public String toString()
    {
        return customer + String.format("balance = Rs. %.2f ",balance);
    }
    
    public double deposit()
    {        
        System.out.println("---------------------------------------------------");
        System.out.print("Enter the amount to deposit : ");
        double dAmount = in.nextDouble();
        balance += dAmount;
        return balance;
    }
    
    public double withdraw()
    {
        double wAmount;
        System.out.println("---------------------------------------------------");
        do{
            System.out.print("Enter the amount to withdraw : ");   
            wAmount = in.nextDouble();
            if(balance >= wAmount)
                balance -= wAmount;
            else
                System.out.println("Withdraw amount exceeded account balance.");
        }while(balance < wAmount); 
        return balance; 
    }
    
    
}
