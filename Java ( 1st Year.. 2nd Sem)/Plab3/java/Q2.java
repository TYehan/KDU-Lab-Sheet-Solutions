package plab.plab3;

class Circle{
    
    double radius;
    String color;
    
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public Circle(String color)
    {
        this.color = color;
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        Circle r1 = new Circle();
        
        System.out.println("\n------------------------------------");
        System.out.println("Default constructor with no argument");
            System.out.println("Radius : "+r1.radius);
            System.out.println("Color  : "+r1.color);
        System.out.println("------------------------------------");
        
        Circle r2 = new Circle(20);
        
        System.out.println("\n------------------------------------");
        System.out.println("Constructor which takes argument for radius");
            System.out.println("Radius : "+r2.radius);
            System.out.println("Color  : "+r2.color);
        System.out.println("------------------------------------");
        
        Circle r3 = new Circle("blue");
        
        System.out.println("\n------------------------------------");
        System.out.println("Constructor which takes argument for color");
            System.out.println("Radius : "+r3.radius);
            System.out.println("Color  : "+r3.color);
        System.out.println("------------------------------------");
    }
}
