package plab.plab8;

public class SuperClass 
{    
    int i;
    void printNum()
    {
        System.out.println("Value of i is : "+i);
    }
}

class SubClass extends SuperClass
{
    int j;
    void printNum()
    {
        System.out.println("Value of j is : "+j);
    }
}

