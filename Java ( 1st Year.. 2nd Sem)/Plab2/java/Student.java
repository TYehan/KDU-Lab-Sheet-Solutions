//T_Yehan
package plab.plab2;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
  
    public String name, birthday, gender;
    public int age;
    
    public void input()
    {
        System.out.print("Enter the Name : ");
            name = in.nextLine();
        System.out.print("Enter the Age : ");
            age = in.nextInt();
        System.out.print("Enter the Birthday : ");
            in.nextLine();
            birthday = in.nextLine();
        System.out.print("Enter the Gender : ");
            gender = in.next();                
    }
    
    public void print()
    {
        System.out.println("---------------------------------------");
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Birthday is "+birthday);
        System.out.println("Gender is "+gender);
        System.out.println("---------------------------------------");
    }
}
