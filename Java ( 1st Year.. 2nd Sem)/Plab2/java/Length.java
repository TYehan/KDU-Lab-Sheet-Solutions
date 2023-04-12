//T_Yehan
package plab.plab2;

import java.util.Scanner;

public class Length {
    Scanner in = new Scanner(System.in);
 
    public int length1, length2, sum;
    
    public void input()
    {
        System.out.print("Enter length 1 : ");
            length1 = in.nextInt();
        System.out.print("Enter length 2 : ");
            length2 = in.nextInt();               
    }
    
    public void add()
    {
        sum = length1 + length2;
    }
    
    public void print()
    {
        System.out.println("---------------------------------------");
        System.out.println("Total Length is "+sum);     
        System.out.println("---------------------------------------");
    }
}
