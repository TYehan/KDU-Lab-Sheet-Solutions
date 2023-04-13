package plab.plab7;

public class Rectangle extends Shape{
    
    private double length, width;
   
    //default constructor
    public Rectangle() 
    {
        this.length = 0;
        this.width = 0;
    }

    //parameterized constructor 1 
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
      
    //parameterized constructor 2
    public Rectangle(double length, double width, String color, boolean filled) 
    {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    
    //getters
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    //setters
    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width= width;
    }
   
    @Override
    public String toString()
    {
        String word;
        if(super.getFilled())
            word = "filled";
        else
            word = "not filled";
        
        return "A Rectangle with length= "+length+" width= "+width+", color of "+super.getColor()+" and "+word;
    }
    
}

////////////////////////////////////////////////////////////////////////////////

class Square extends Rectangle{
    
    //constructors
    public Square()
    {
        super();
    }
    
    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    
    //setters for length and width to make them equal
    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }
    
    //getter for side
    public double getSide()
    {
        return super.getLength();
    }
    
    //setter for side
    public void setSide(double side)
    {
        side = super.getLength();
    }
    
    @Override
    public String toString()
    {
        String word;
        if(super.getFilled())
            word = "filled";
        else
            word = "not filled";
        
        return "A Square with side= "+super.getLength()+", color of "+super.getColor()+" and "+word;
    }
    
    //method to get area
    public double getArea()
    {
        double area = super.getLength()*super.getWidth();
        return area;
        //System.out.println("Area is "+area);
    }
        
    //method to get primeter
    public double getPerimeter()
    {
        double perimeter = 2*super.getLength() + 2*super.getWidth();
        return perimeter;
        //System.out.println("Perimeter is "+perimeter);
    }
    
}
