import java.util.Scanner;
//Subclass of Account
public class CurrentAccount extends Account {
    private float minimumBalance;

    public CurrentAccount() {
        this.minimumBalance = 1000; //minimum balance set by the programmer
    }

    public CurrentAccount(Owner owner, float balance, String number, float minimumBalance) {
        super(owner, balance, number);
        this.minimumBalance = minimumBalance;
    }

    public CurrentAccount(CurrentAccount a) {
        super();
        this.minimumBalance = a.minimumBalance;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Current Account-----");
        super.input();
    }

    public void print() {
        System.out.println("----------Current Account----------");
        super.print();
        System.out.println("Minimum Balance: "+minimumBalance);
    }

    @Override
    public String toString() {
        return ("Current Account");
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }
}
