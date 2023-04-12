package plab.plab4;

public class Employee {
    String firstName, lastName;
    double mSalary;
    
    public Employee()
    {
        this.firstName = "null";
        this.lastName = "null";
        this.mSalary = 0.0;
    }
    
    public Employee(String firstName)
    {
        this.firstName = firstName;
    }
    
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(String firstName, String lastName, double mSalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mSalary = mSalary;
    }
    
    public Employee(Employee e)
    {
        this(e.firstName, e.lastName, e.mSalary);
    }
    
    public static void main(String[] args) {
                    
        Employee e1 = new Employee();
        System.out.println("\n----------------------------------------");
        System.out.println("Default Constructor");
        System.out.println("----------------------------------------");
        System.out.println("First Name      : "+e1.firstName);
        System.out.println("Last Name       : "+e1.lastName);
        System.out.println("Monthly Salary  : "+e1.mSalary);
        System.out.println("----------------------------------------");
        
        Employee e2 = new Employee("Tharindu");
        System.out.println("\n----------------------------------------");
        System.out.println("Only First name is supplied");
        System.out.println("----------------------------------------");
        System.out.println("First Name      : "+e2.firstName);
        System.out.println("Last Name       : "+e2.lastName);
        System.out.println("Monthly Salary  : "+e2.mSalary);
        System.out.println("----------------------------------------");
        
        Employee e3 = new Employee("Tharindu", "Yehan");
        System.out.println("\n----------------------------------------");
        System.out.println("Only First name & Last name are supplied");
        System.out.println("----------------------------------------");
        System.out.println("First Name      : "+e3.firstName);
        System.out.println("Last Name       : "+e3.lastName);
        System.out.println("Monthly Salary  : "+e3.mSalary);
        System.out.println("----------------------------------------");
        
        Employee e4 = new Employee("Tharindu", "Yehan", 125000);
        System.out.println("\n----------------------------------------");
        System.out.println("All are Supplied");
        System.out.println("----------------------------------------");
        System.out.println("First Name      : "+e4.firstName);
        System.out.println("Last Name       : "+e4.lastName);
        System.out.println("Monthly Salary  : "+e4.mSalary);
        System.out.println("----------------------------------------");
        
        Employee Emp2 = new Employee(e4);
        System.out.println("\n----------------------------------------");
        System.out.println("Object Passed - Emp2");
        System.out.println("----------------------------------------");
        System.out.println("First Name      : "+Emp2.firstName);
        System.out.println("Last Name       : "+Emp2.lastName);
        System.out.println("Monthly Salary  : "+Emp2.mSalary);
        System.out.println("----------------------------------------");
    }
}
