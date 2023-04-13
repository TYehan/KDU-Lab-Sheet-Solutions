package plab.plab8;

public class PrintNumber {
       
    static void printn(int n)
    {
        System.out.println("Input as an Integer: "+n);
    }
    
    static void printn(double n)
    {
        System.out.println("Input as a Double: "+n);
    }
    
    static void printn(float n)
    {
        System.out.println("Input as a Float: "+n);
    }
    
    static void printn(String n)
    {
        System.out.println("Input as a String: "+n);
    }
    
    public static void main(String[] args) {
        
        printn(17);
        printn(20.023335);
        printn(26.23456f);
        printn("03");
    }
}
