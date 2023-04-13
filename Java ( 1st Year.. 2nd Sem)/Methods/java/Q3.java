import java.util.Scanner;
public class Q3 {
    public static void Password(String pword)
    {
        int count=0; //Variable to count characters other than Letters or Digits
        
        if(pword.length()<10)
            System.out.println("Invalid Password"); //If password hasn't at least 10 characters directly its Invalid
        else
        {
            for(int i=0; i<pword.length(); i++) //Counting how many characters are there other than Letters or Digits
            {
                char ch = pword.charAt(i);
                if(!Character.isLetterOrDigit(ch)) //Using the "isLetterOrDigit" method from "java.lang.Character"
                    count++;
            }
            if(count != 0) //If there are invalid character printing "Invalid"
                System.out.println("Invalid Password");
            else
                System.out.println("Valid Password");
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String pword = in.nextLine();
        
        Password(pword);
    }
}

