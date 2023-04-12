package plab.plab4;

import java.util.Scanner;

public class Name {
    Scanner in = new Scanner(System.in);
    
    String FirstName;
    String MiddleName;
    String LastName;
    
    ///Default Constructor///
    public Name()
    {
        this.FirstName = "First";
        this.MiddleName = "Middle";
        this.LastName = "Last";
    }
    
    ///Parameterized Constructor///
    public Name(String FirstName, String MiddleName, String LastName)
    {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
    }
    
    ///Object Passed///
    public Name(Name n)
    {
        this(n.FirstName, n.MiddleName, n.LastName);
    }
    
    public void input()
    {
        System.out.print("Enter the First Name : ");
            FirstName = in.nextLine();
        System.out.print("Enter the Middle Name : ");
            MiddleName = in.nextLine();               
        System.out.print("Enter the Last Name : ");
            LastName = in.nextLine();
    }
    
    @Override
    public String toString()
    {
        return(FirstName+" "+MiddleName+" "+LastName);
    }
    
    ///Name with intials///
    public String myName()
    {
        return(FirstName.charAt(0)+"."+MiddleName.charAt(0)+". "+LastName);
    }
    
////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
        Name n1 = new Name();
        System.out.println("\n----------------------------------------");
        System.out.println("Default Constructor");
        System.out.println("----------------------------------------");
        System.out.println("Full Name         : "+n1);
        System.out.println("Name with Intials : "+n1.myName());
        System.out.println("----------------------------------------");
        
        Name n2 = new Name("Tharindu", "Yehan", "Bandara");
        System.out.println("\n----------------------------------------");
        System.out.println("Parameterized Constructor");
        System.out.println("----------------------------------------");
        System.out.println("Full Name         : "+n2);
        System.out.println("Name with Intials : "+n2.myName());
        System.out.println("----------------------------------------");
       
        Name n3 = new Name(n2);
        System.out.println("\n----------------------------------------");
        System.out.println("Object Passed");
        System.out.println("----------------------------------------");
        System.out.println("Full Name         :"+n3);
        System.out.println("Name with Intials :"+n3.myName());
        System.out.println("----------------------------------------");
        
    }
    
}

