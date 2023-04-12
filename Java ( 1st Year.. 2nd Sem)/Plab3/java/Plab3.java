//T_Yehan
package plab.plab3;

   class Time{
    int hour, minute, second;
    
    public Time()
    {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public Time(int hour)
    {
        this.hour = hour;
    }
    
    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }
    
    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time(Time t)  //t is a object created for Time
    {
        hour = t.hour;
        minute = t.minute;
        second = t.second;
    }
    
}

public class Plab3 {

    public static void main(String[] args) {
        
        Time t1 = new Time();
        
        System.out.println("\n------------------------------------");
        System.out.println("No-argument constructor");
            System.out.println("Hours   : "+t1.hour);
            System.out.println("Minutes : "+t1.minute);
            System.out.println("Seconds : "+t1.second);
        System.out.println("------------------------------------");
        
        Time t2 = new Time(45);
        
        System.out.println("\n------------------------------------");
        System.out.println("Constructor: hour supplied");
            System.out.println("Hours   : "+t2.hour);
            System.out.println("Minutes : "+t2.minute);
            System.out.println("Seconds : "+t2.second);
        System.out.println("------------------------------------");
        
        Time t3 = new Time(34,12);
        
        System.out.println("\n------------------------------------");
        System.out.println("Constructor: hour and minute supplied");
            System.out.println("Hours   : "+t3.hour);
            System.out.println("Minutes : "+t3.minute);
            System.out.println("Seconds : "+t3.second);
        System.out.println("------------------------------------");
        
        Time t4 = new Time(32,30,11);
        System.out.println("\n------------------------------------");
        System.out.println("Constructor: hour, minute and second supplied");
            System.out.println("Hours   : "+t4.hour);
            System.out.println("Minutes : "+t4.minute);
            System.out.println("Seconds : "+t4.second);
        System.out.println("------------------------------------");
        
        Time t5 = new Time(t4);
        System.out.println("\n------------------------------------");
        System.out.println("Constructor: Another object supplied");
            System.out.println("Hours   : "+t5.hour);
            System.out.println("Minutes : "+t5.minute);
            System.out.println("Seconds : "+t5.second);
        System.out.println("------------------------------------");
    }
}
