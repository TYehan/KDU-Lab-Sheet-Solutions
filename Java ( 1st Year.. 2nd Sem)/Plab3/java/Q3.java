//T_Yehan
package plab.plab3;

import static java.lang.Math.sqrt;

class MyPoint{
    int x;
    int y;
    
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public String toString(int x,int y)
    {
        return ("("+x+","+y+")");
    }
    
    public double distance(int x, int y)
    {
        double dist = sqrt((x*x)+(y*y));
        return (dist);
    }
    
}

public class Q3 {
    public static void main(String[] args) {
        
        MyPoint p1 = new MyPoint();
        
        System.out.println("\n------------------------------------");
        System.out.println("Default constructor with no argument");
            System.out.println("x : "+p1.x);
            System.out.println("y : "+p1.y);
        System.out.println("------------------------------------");
        
        MyPoint p2 = new MyPoint(2,3);
        
        System.out.println("\n------------------------------------");
        System.out.println("Constructor with given x and y");
            System.out.println("x : "+p2.x);
            System.out.println("y : "+p2.y);
        System.out.println("------------------------------------");
        
        MyPoint p3 = new MyPoint();
        
        System.out.println("\n------------------------------------");
        System.out.println("Return in another format");
            System.out.println(p3.toString(3,4));
        System.out.println("------------------------------------");
        
        MyPoint d = new MyPoint();
        
        System.out.println("\n------------------------------------");
        System.out.println("Return the distance");
            System.out.println(d.distance(3,4));
        System.out.println("------------------------------------");
        
    }
}
