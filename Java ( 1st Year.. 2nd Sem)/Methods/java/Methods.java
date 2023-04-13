import java.util.Scanner;
public class Methods {
    
    public static double Average(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        System.out.println("Enter the third number");
        int num3 = in.nextInt();
        double avg = ((num1 + num2 + num3)/3);
        return avg;
    }
    public static void main(String[] args) {
        double avg = Average();
        System.out.println("Average is : " + avg);
    }
}
