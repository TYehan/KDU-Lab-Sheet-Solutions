package plab.plab8;

public class PrintArea {
   
    static void area(double a)
    {
        System.out.println("Area of the Square is :"+(a*a));
    }
    
    static void area(double a, double b)
    {
        System.out.println("Area of the Rectangle is :"+(a*b));
    }
    
    public static void main(String[] args) {
        
        //Area of a Square while inputing one side as it's parameter
        area(5);
        //Area of a Rectangle while inputing both sides as it's parameteres
        area(4,6);
    }
}
