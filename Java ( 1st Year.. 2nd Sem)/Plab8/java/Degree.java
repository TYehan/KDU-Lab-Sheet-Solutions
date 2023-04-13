package plab.plab8;

public class Degree 
{    
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree
{
    @Override
    void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree
{
    @Override
    void getDegree()
    {
        System.out.println("I am a Postgraduate");
    }
}
