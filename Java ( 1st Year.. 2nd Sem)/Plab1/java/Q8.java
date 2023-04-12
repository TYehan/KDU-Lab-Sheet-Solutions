import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Enter two numbers to swap:");
        x = input.nextInt();
        y = input.nextInt();
        System.out.println("Before Swap : " + x + " " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swap : " + x + " " + y);
}
}
