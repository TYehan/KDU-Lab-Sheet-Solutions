//T_Yehan
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temp;
        System.out.println("Enter temperature in Celcius : ");
        temp = input.nextFloat();
        System.out.println("Temperature in Fahrenheit : " + (9*temp)/5+32);
    }
}
