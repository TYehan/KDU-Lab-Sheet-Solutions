import java.util.Scanner;
//A composition of Account
public class Owner {
    private String name;
    private String nic;
    private Date dob;

    public Owner() {
        this.name = "null";
        this.nic = "null";
        this.dob = new Date();
    }

    public Owner(String name, String nic, Date dob) {
        this.name = name;
        this.nic = nic;
        this.dob = new Date(dob);
    }

    public Owner(Owner o) {
        this(o.name, o.nic, o.dob);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        this.name = in.nextLine();
        System.out.println("Enter the NIC: ");
        this.nic = in.nextLine();
        System.out.println("Enter the Birthday: ");
        this.dob.input(); //using date class input
    }

    public void print() {
        System.out.println("Owner Information");
        System.out.println("Name: " + this.name);
        System.out.println("NIC: " + this.nic);
        System.out.println("Birthday: " + this.dob);
    }

    @Override
    public String toString() {
        return ("\nName: "+this.name+"\n"+"\nNIC: "+this.nic+"\nBirthday: "+this.dob);
    }
}
