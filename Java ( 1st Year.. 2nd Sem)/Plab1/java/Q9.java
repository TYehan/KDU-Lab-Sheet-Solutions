//T_Yehan
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float weight, height, BMI;
       
        System.out.println("Enter weight in kilograms : ");
        weight = input.nextFloat();
        System.out.println("Enter height in meters : ");
        height = input.nextFloat();
       
        BMI = weight / (height*height);
        System.out.println("BMI is: " + BMI);
        
        if(BMI<18.5)
            System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<=24.9)
            System.out.println("Normal");
        else if(BMI>24.9 && BMI<=29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
}
}
