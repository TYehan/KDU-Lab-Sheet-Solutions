package plab.plab2;

import java.util.Scanner;

public class Date {
    Scanner in = new Scanner(System.in);
    
    public int day, month, year;
    public static String prefix;
    
    public void input()
    {
        System.out.print("Enter the Day : ");
            day = in.nextInt();
        System.out.print("Enter the Month : ");
            month = in.nextInt();            
        System.out.print("Enter the Year : ");
            year = in.nextInt();
    }
    
    public void printFormat1()
    {
        System.out.println("---------------------------------------");
        System.out.println("\tFormat 1 : "+day+"."+month+"."+year);     
        System.out.println("---------------------------------------");
    }
    
    public void printFormat2()
    {        
        switch(day)
        {
            case 1, 21, 31: prefix = "st";
                break;
            case 2, 22: prefix = "nd";
                break;
            case 3, 23: prefix = "rd";    
                break;
            default : prefix = "th";
                break;
        }
        
        String[] word = {"Invalid Input","January","February","March","April","May",
            "June","July","August","September","October","November","December"};
        
        System.out.println("---------------------------------------");
        System.out.println("\tFormat 2 : "+day+prefix+" "+word[month]+" "+year);     
        System.out.println("---------------------------------------");
    }
}
