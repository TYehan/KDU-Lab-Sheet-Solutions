//T_Yehan
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
  
       int tot=0;
       float percentage;
       
       Scanner input = new Scanner(System.in);
       int[] sub = new int[5];
        System.out.println("Enter marks of 5 subjects: ");
        for(int i=0; i<5; i++)
        {
            sub[i] = input.nextInt();
            tot += sub[i];
        }
        percentage = tot/5;
        System.out.println("Percentage is " + percentage);
}
}
