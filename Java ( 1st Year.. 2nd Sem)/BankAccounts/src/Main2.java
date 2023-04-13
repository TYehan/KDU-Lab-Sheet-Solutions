////Coded by Tharindu Yehan
//import java.util.Scanner;
////Main method
//public class Main2 {
//    static Scanner in = new Scanner(System.in); //object to take inputs
//
//    //variables(properties)
//    public static int i;
//    public static int option = 0; //variable to select an option
//    public static int totalAccounts = 100; //Maximum amount of accounts that can store data for each type
//    public static int indexNo = 0; //variable use to count array indexes
//
//    //creating array to store data using Account class
//    static Account[] account = new Account[totalAccounts];
//
//    //methods
//    public static void main(String[] args) {
//        do {
//            mainMenu();
//            //implemented a separate method to include "Back to Menu Option"
//        } while (option != 5);
//    }
//
//    public static int mainMenu() {
//        System.out.println("\n-------------MENU-------------");
//        System.out.println("1. Add New Account");
//        System.out.println("2. Deposit or Withdraw Amount");
//        System.out.println("3. Get Balance for the given Account");
//        System.out.println("4. Print all Account Information");
//        System.out.println("5. Exit");
//        System.out.println("-------------------------------");
//
//        getOption();
//        switch (option) {
//            case 1:
//                addNewAccount();
//                break;
//            case 2:
//                depositOrWithdraw();
////                accountTypeSelection(); //savings or current account
////                findAccount(); //accessing to the database
//                getOption();
//                break;
//            case 3:
//                accountTypeSelection(); //savings or current account
////                findAccount(); //accessing to the database
////                printBalance();
//                break;
//            case 4:
////                accountTypeSelection(); //savings or current account
////                findAccount(); //accessing to the database
//                break;
//            case 5:
//                System.out.println("Exiting the Program");
//                break;
//            default:
//                System.out.println("Invalid Input!");
//                break;
//        }
//        return option;
//    }
//
//    public static int getOption() {
//
//        System.out.print("Enter an Option: ");
//        option = in.nextInt();
//        return option;
//    }
//
//    public static void addNewAccount() {
//        do {
//            System.out.println("\n-------Adding New Account-------");
//            System.out.println("1. New Savings Account");
//            System.out.println("2. New Current Account");
//            System.out.println("3. Back to Main Menu");
//            System.out.println("-------------------------------");
//            getOption();
//            switch (option) {
//                case 1:
//                    account[indexNo] = new SavingsAccount();
//                    account[indexNo].setType("Savings Account");
//                    account[indexNo].input();
//                    indexNo++;
//                    break;
//                case 2:
//                    account[indexNo] = new CurrentAccount();
//                    account[indexNo].setType("Current Account");
//                    account[indexNo].input();
//                    indexNo++;
//                    break;
//                case 3:
//                    mainMenu();
//                    break;
//                default:
//                    System.out.println("Invalid Input!");
//            }
//        } while (!(option <= 1 && option >= 3));
//    }
//
//    //method used to choose and find the given account
//    public static void accountTypeSelection() {
//        System.out.println("\n-------Select Account Type-------");
//        System.out.println("1. Savings Account");
//        System.out.println("2. Current Account");
//        System.out.println("3. Back to Main Menu");
//        System.out.println("--------------------------------");
//        getOption();
//        do{
//            switch (option) {
//                case 1:
//                    //searchArray();
//                    break;
//                case 2:
//                    //searchArray();
//                    break;
//                case 3:
//                    mainMenu();
//                    break;
//                default:
//                    System.out.println("Invalid Input!");
//            }
//        } while (!(option <= 1 && option >= 3));
//    }
//
//    public static void depositOrWithdraw() {
//        System.out.println("\n-----Deposit or Withdraw-----");
//        System.out.println("1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Back to Main Menu");
//        System.out.println("----------------------------");
//        getOption();
//        do {
//            switch (option) {
//                case 1:
//                    deposit();
//                    break;
//                case 2:
//                    withdraw();
//                    break;
//            }
//        } while (!(option <= 1 && option >= 3));
//    }
//
//    public static void deposit() {
//        searchArray();
//        System.out.print("Enter Amount to Deposit: ");
//        float amount = in.nextFloat();
//        amount += account[i].getBalance();
//        account[i].setBalance(amount);
//        account[i].toString();
//    }
//
//    public static void withdraw() {
//        searchArray();
//    }
//
//    //method which searches the stored data from arrays
//    public static int searchArray() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("\nEnter the Account Number: ");
//        String accountNo = input.nextLine();
//        //checking whether that the account number exists inside the array using loop
//        boolean isFound = false;
//        for (i = 0; i < totalAccounts; i++) {
//            if (account[i].getNumber().equals(accountNo)) {
//                isFound = true;
//                break;
//            }
//        }
//        //if it exists, print it
//        if (isFound) {
//            System.out.println("\n");
//            account[i].print();
//        } else {
//            System.out.println("\nNo Search Result Found!");
//        }
//        return i;
//    }
//}
