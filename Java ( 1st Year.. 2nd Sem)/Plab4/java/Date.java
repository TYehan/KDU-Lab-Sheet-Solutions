package plab.plab4;

public class Date {
    int day, month, year;
    
    public Date()
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public Date(Date d)
    {
        this(d.day, d.month, d.year);
    }
    
    public static void PrintDate(int day, int month, int year)
    {
        System.out.println(day+" / "+month+" / "+year); 
    }
    
    public static void main(String[] args) {
        
        Date d1 = new Date();
        System.out.println("\n----------------------------------------");
        System.out.println("Default Constructor");
        System.out.println("----------------------------------------");
        System.out.println("Day   : "+d1.day);
        System.out.println("Month : "+d1.month);
        System.out.println("Year  : "+d1.year);
        System.out.println("----------------------------------------");
        
        Date d2 = new Date(17, 11, 2000);
        System.out.println("\n----------------------------------------");
        System.out.println("All data are supplied");
        System.out.println("----------------------------------------");
        System.out.println("Day   : "+d2.day);
        System.out.println("Month : "+d2.month);
        System.out.println("Year  : "+d2.year);
        System.out.println("----------------------------------------");
       
        System.out.println("\n----------------------------------------");
        System.out.println("Dispaly Date Method");
        System.out.println("----------------------------------------");
        PrintDate(18, 06, 2022);
        System.out.println("----------------------------------------");
    }
}
