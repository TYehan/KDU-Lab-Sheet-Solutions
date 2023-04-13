import java.util.Scanner;
public class Q2 {
    public static int count=0; //variable to take the count
    
    public static int Count(String text){
        
        for(int i=0; i<text.length(); i++) 
            {
                if(text.charAt(i) == ' ') // counting how many spaces are there
                    count++;
            } 
        if((text.charAt(0) != ' ')&&(text.charAt(text.length()-1) != ' ')) //If there are no "spaces" available at the start and the end
            return (count+1);
        else if((text.charAt(0) == ' ')&&(text.charAt(text.length()-1) == ' ')) //If user enters "spaces" at the beginning and at the end 
            return (count-1);
        else
            return (count); //If user enters "spaces" either at the beginning or at the end
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string : ");
        String text = in.nextLine();
        
        System.out.println("Number of words in the string: " + Count(text) );
    }
}
