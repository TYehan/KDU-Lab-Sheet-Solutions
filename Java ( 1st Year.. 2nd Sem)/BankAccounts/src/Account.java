import java.util.Scanner;
//Super Class
public class Account {
    private Owner owner;
    private String number;
    private float balance;

    public Account() {
        this.owner = new Owner();
        this.number = "xxxx-xxxx-xxxx-xxxx";
        this.balance = 0.0f;
    }

    public Account(Owner owner, float balance, String number) {
        this.owner = new Owner(owner);
        this.number = number;
        this.balance = balance;
    }

    public Account(Account a) {
        this(a.owner, a.balance, a.number);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account Information");
        this.owner.input();
        System.out.print("Enter the Account Number: ");
        this.number = in.nextLine();
    }

    public void deposit() {
        Scanner in = new Scanner(System.in);
        float depositAmount;
        System.out.println("----------Deposit----------");
        System.out.print("Enter Amount to Deposit: ");
        depositAmount = in.nextFloat();
        if(depositAmount >0) {
            this.balance += depositAmount;
        }
        else {
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw() {
        Scanner in = new Scanner(System.in);
        float withdrawAmount;
        System.out.println("----------Withdraw----------");
        System.out.print("Enter Amount to Withdraw: ");
        withdrawAmount = in.nextFloat();
        if(withdrawAmount >= 0 && this.balance > withdrawAmount) {
            this.balance -= withdrawAmount;
        }
        else {
            System.out.println("Invalid Amount!");
        }
    }

    public void print() {
        System.out.println("Account Information");
        System.out.println("Account Owner "+this.owner);
        System.out.println("Account Number: "+this.number);
        System.out.println("Account Balance: "+this.balance);
    }

    @Override
    public String toString() {
        return ("\nAccount Number: " + this.number + "\nUpdated Balance: " + this.balance );
    }

    public String getNumber() {
        return number;
    }

    public float getBalance() {
        return balance;
    }
}
