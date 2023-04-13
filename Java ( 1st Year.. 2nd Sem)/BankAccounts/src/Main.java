//Coded by Tharindu Yehan Bandara
import java.util.Scanner;
//Main method
public class Main {

    static Account account[] = new Account[100]; //array can store up to 100 accounts
    public static int AccountCount; //variable use to count array indexes

    public static void mainMenu() {
        System.out.println("\n-------------MENU-------------");
        System.out.println("1. Add New Account");
        System.out.println("2. Deposit or Withdraw Amount");
        System.out.println("3. Get Balance for the given Account");
        System.out.println("4. Print all Account Information");
        System.out.println("5. Exit");
        System.out.println("-------------------------------");
    }

    public static int getMenuOption() {
        int option;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an option: ");
        option = in.nextInt();
        return option;
    }

    public static void addNewAccount() {
        int type = 0;
        System.out.println("\n------Enter the Account Type------");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        type = getMenuOption();
        switch (type) {
            case 1: //Savings Account
                account[AccountCount] = new SavingsAccount(); //creating object of Savings Acc. to array
                account[AccountCount].input();
                AccountCount++;
                break;
            case 2: //Current Account
                account[AccountCount] = new CurrentAccount(); //creating object of Current Acc. to array
                account[AccountCount].input();
                AccountCount++;
                break;
        }
    }

    public static void getBalance() {
        String accountNum; //variable to take the input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        accountNum = in.nextLine();

        //looping through the array while comparing the Account number
        for (int i = 0; i < AccountCount; i++) {
            if(account[i].getNumber().equals(accountNum)) {
                System.out.println("Balance :" + account[i].getBalance());
            }
            else
                System.out.println("No Search Result Found!");
        }
    }

    public static void depositOrWithdraw() {
        int type = 0;
        String accountNum; //variable to take the input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        accountNum = in.nextLine();
        System.out.println("\n----Deposit or Withdraw----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        type = getMenuOption();

        //looping through the array while comparing the Account number
        for (int i = 0; i < AccountCount; i++) {
            if (account[i].getNumber().equals(accountNum)) {
                if (type == 1)
                    account[i].deposit();
                else
                    account[i].withdraw();
            }
            else
                System.out.println("No Search Result Found!");
        }
    }

    public static void printAll() {
        for (int i = 0; i < AccountCount; i++) {
            account[i].print();
        }
    }

    //Main Method
    public static void main(String[] args) {
        AccountCount = 0;
        int op = 0;
        do {
            mainMenu();
            op = getMenuOption();
            switch (op) {
                case 1:
                    System.out.println("Add New Account");
                    addNewAccount();
                    break;
                case 2:
                    depositOrWithdraw();
                    break;
                case 3:
                    System.out.println("Get Balance");
                    getBalance();
                    break;
                case 4:
                    System.out.println("Printing All");
                    printAll();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    break;
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        } while (op != 5);
    }
}
