import java.util.Scanner;
//A composition of Owner
public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date d) {
        this(d.day, d.month, d.year);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Day: ");
        this.day = in.nextInt();
        System.out.print("Month: ");
        this.month = in.nextInt();
        System.out.print("Year: ");
        this.year = in.nextInt();
    }

    public void print() {
        System.out.println("Date of Birth: " + this.day + "/" + this.month + "/" + this.year);
    }

    @Override
    public String toString() {
        return ("\nDate of Birth: " + this.day + "/" + this.month + "/" + this.year);
    }
}
