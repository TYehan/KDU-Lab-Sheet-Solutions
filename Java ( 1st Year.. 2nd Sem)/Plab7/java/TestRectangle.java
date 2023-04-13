package plab.plab7;

public class TestRectangle {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        
       
        Rectangle r2 = new Rectangle(5,4);
        System.out.println(r2);
        
       
        Rectangle r3 = new Rectangle(6,5, "Blue", false);
        System.out.println(r3);
        
        System.out.println("-----------------------------------------------------------------------");   
        
        Square s1 = new Square();
        System.out.println(s1);
        
        Square s2 = new Square(3);
        System.out.println(s2);
        
        Square s3 = new Square(7, "Red", true);
        System.out.println(s3);
        
        System.out.println("-----------------------------------------------------------------------");   
        
        System.out.println(String.format("Area is %.2f",s3.getArea()));
        System.out.println(String.format("Perimeter is %.2f",s3.getPerimeter()));
        
    ///////////////////////////////////////////////////////////////////////////
//           
//        Shape s1 = new Shape();
//        Shape s2 = new Shape("Blue", true);
//        
//        System.out.println("----------------------------------------------------");
//        System.out.println(s1);
//        System.out.println("----------------------------------------------------");
//        System.out.println(s2);
//        System.out.println("----------------------------------------------------");
//         
//        Circle c1 = new Circle();
//        Circle c2 = new Circle(14.0);
//        Circle c3 = new Circle();
//        c3.setColor("Blue");
//        c3.setFill(true);
//        c3.setRadius(21.00);
//       
//        System.out.println(c1);
//        System.out.println("----------------------------------------------------");
//        System.out.println(c2);
//        System.out.println("----------------------------------------------------");
//        System.out.println(c3);
//        System.out.println("----------------------------------------------------");
//        
//        System.out.println(String.format("Area is %.2f",c3.getArea()));
//        //c3.getArea();
//        System.out.println("----------------------------------------------------");
//        System.out.println(String.format("Perimeter is %.2f",c3.getPerimeter()));
//        //c3.getPerimeter();
//        System.out.println("----------------------------------------------------");
        
    }
}
