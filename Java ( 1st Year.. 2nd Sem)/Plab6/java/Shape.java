package plab.plab6;

public class Shape {

    final double pi = 3.14285;
    private String color;
    private boolean filled;
    
    //constructor without parameters
    public Shape()
    {
        this.color = "Green";
        this.filled = true;
    }
    
    //constructor with parameters
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    //getters
    public String getColor()
    {
        return color;
    }
    
    public boolean getFilled()
    {
        return filled;
    }
    
    //setters
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setFill(boolean filled)
    {
        this.filled = filled;
    }
         
    @Override
    public String toString()
    {
        String word;
        if(getFilled())
            word = "filled";
        else
            word = "not filled";
            
        return ("A shape with color of "+color+" and "+word);
    }
}   
////////////////////////////////////////////////////////////////////////////////
    class Circle extends Shape{
        
        private double radius;
         
        //default constructor
        public Circle()
        {
            this.radius = 1.0;
        }
        
        //constructor with one parameter
        public Circle(double radius)
        {
            this.radius = radius;
        }
        
        //constructor with parameters
        public Circle(double radius, String color, boolean filled)
        {
            super(color, filled);
            this.radius = radius;
        }
        
        //getter 
        public double getRadius()
        {
            return radius;
        }
        
        //setter
        public void setRadius(double r)
        {
            this.radius = r;
        }
        
        //method to get area
        public double getArea()
        {
            double area = pi*radius*radius;
            return area;
            //System.out.println("Area is "+area);
        }
        
        //method to get primeter
        public double getPerimeter()
        {
            double perimeter = 2*pi*radius;
            return perimeter;
            //System.out.println("Perimeter is "+perimeter);
        }
                    
        @Override
        public String toString()
        {
            String word;
            if(getFilled())
                word = "filled";
            else
                word = "not filled";
            
            return "A Circle with radius = "+radius+", color of "+super.getColor()+" and "+word;
        }
}

