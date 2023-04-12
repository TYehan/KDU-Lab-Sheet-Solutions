package plab.plab2;

import java.util.Scanner;

public class Name {
    Scanner in = new Scanner(System.in);
    
    String FirstName;
    String MiddleName;
    String LastName;
    
    public void input()
    {
        System.out.print("Enter the First Name : ");
            FirstName = in.nextLine();
        System.out.print("Enter the Middle Name : ");
            MiddleName = in.nextLine();               
        System.out.print("Enter the Last Name : ");
            LastName = in.nextLine();
    }
        
    public void print()
    {
        System.out.println("---------------------------------------");
        System.out.print("\nFull Name is "+FirstName+" "+MiddleName+" "+LastName);
        System.out.println("\n---------------------------------------");
    }
}
