package plab.methods2;
import java.util.Scanner;
public class Methods2 {

    public static String name, no, degree, ch; //variables used
    public static int count;
    public static double gpa;
    
    public static void Menu(){
        System.out.println("\n-------------------------");
        System.out.println("\tMENU");
        System.out.println("-------------------------");
        System.out.println(" 1. Register a Student ");
        System.out.println(" 2. Degree Details ");
        System.out.println(" 3. Calculate GPA ");
        System.out.println(" 4. Print student Record ");
        System.out.println("-------------------------\n");
    }

////////////////////////////////////////////////////////////////////////////////
    public static void Register(){
        Scanner r = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("\tStudent Registration ");
        System.out.println("-------------------------------------");
        System.out.print("Enter the Name         : ");
            name = r.nextLine();
        System.out.print("Enter the Index Number : ");
            no = r.nextLine();
        System.out.print("Enter the Birthday     : ");
        String birth = r.nextLine();
    }
    
////////////////////////////////////////////////////////////////////////////////
    public static void Degree(){
        Scanner d = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("\tDegree Details ");
        System.out.println("-----------------------------------");
        System.out.print("Enter your Degree Program : ");
            degree = d.nextLine();
        System.out.print("Enter the Department      : ");
        String depart = d.nextLine();
    }
    
////////////////////////////////////////////////////////////////////////////////
    public static void GPA(){
        int totalCredit = 0; //variable to take the total credit count
        Scanner g = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("\t Calculate GPA ");
        System.out.println("-----------------------------------------------");
        
        System.out.print("Enter the module count : "); // Taking how many modules the course consists of
        count = g.nextInt();
        
        int[] marks; // declairing an array to take marks       
            marks = new int[count];
        int[] credit; // declaring an array to take credit count per module 
            credit = new int[count];
            
        for(int i=0; i<count; i++){
            System.out.print("\nEnter the Marks for the Module "+(i+1)+"  : ");
            marks[i] = g.nextInt();
            System.out.print("Enter the Credit count for Module "+(i+1)+" : ");
            credit[i] = g.nextInt();
            
            totalCredit += credit[i]; // taking the total credit count which was entered
        }
        Calculate(marks, credit, totalCredit); // calling the function in order to calculate the GPA
    }
    
////////////////////////////////////////////////////////////////////////////////
    public static double Calculate(int[] marks, int[] credit, int totalCredit){
        float points; // taking the specific GPA point by its marks
  
        for(int i=0; i<count; i++){
            if(marks[i]>=75)
                points = 4.00f;
            else if(marks[i]>=70)
                points = 3.70f;
            else if(marks[i]>=65)
                points = 3.30f;
            else if(marks[i]>=60)
                points = 3.00f;
            else if(marks[i]>=55)
                points = 2.70f;
            else if(marks[i]>=50)
                points = 2.30f;
            else if(marks[i]>=45)
                points = 2.00f;
            else if(marks[i]>=40)
                points = 1.70f;
            else if(marks[i]>=35)
                points = 1.30f;
            else
                points = 0.00f;

            gpa += (points*credit[i]); // Equation to calculate GPA
        }
        gpa /= totalCredit; // Equation continues...
        
        return gpa; //Returing GPA to PrintResult 
    }
    
////////////////////////////////////////////////////////////////////////////////
    public static void PrintResult(double gpa){
        System.out.println("Student Name : "+name);
        System.out.println("Index number : "+no);
        System.out.println("Degree       : "+degree);
        System.out.println("Final GPA    : "+gpa);
    }

////////////////////////////////////////////////////////////////////////////////    
    public static void main(String[] args) {
        
        int op;
        Scanner in = new Scanner(System.in);
        
        while(true){
            
            Menu();
            System.out.print("Select an option : ");   
            
            op = in.nextInt();
            
            switch(op){
                case 1 : Register();
                    break;
                case 2 : Degree();
                    break;
                case 3 : GPA();
                    break;
                case 4 : PrintResult(gpa);
                    break;
                default : System.out.println("Invalid Option ");
                    break;
            }
            
            if(op>=1 && op<=4){  // Prompting the user to select another option
                do{
                    System.out.print("\nDo you want to select another option(y/n) : ");
                    ch = in.next();
                    
                    if(ch.equals("n") || ch.equals("N")){
                        System.out.println("\nProgram Terminated");
                       break; 
                    }
                }while(!(ch.equals("Y") || ch.equals("y")));
            }
            if(ch.equals("n") || ch.equals("N"))
                break; // Exiting from the loop if ch is "n" 
        }
    }
    
}
