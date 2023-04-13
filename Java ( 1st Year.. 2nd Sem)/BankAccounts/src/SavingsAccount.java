import java.util.Scanner;
//Subclass of Account
public class SavingsAccount extends Account {
    private float interestRate; //Interest rate set by the programmer

    public SavingsAccount() {
        super();
        this.interestRate = 0.8f; //interest rate is being assigned by the user
    }

    public SavingsAccount(Owner owner, float balance, String number, float interestRate) {
        super(owner, balance, number);
        this.interestRate = interestRate;
    }

    public SavingsAccount(SavingsAccount s) {
        super();
        this.interestRate = s.interestRate;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Savings Account-----");
        super.input();
    }

    public void print() {
        System.out.println("----------Savings Account----------");
        super.print();
        System.out.println("Interest Rate: "+interestRate);
    }

    @Override
    public String toString() {
        return ("Savings Account");
    }

    public float getInterest() {
        float interest;
        interest = getBalance()*interestRate;
        return interest;
    }

}


