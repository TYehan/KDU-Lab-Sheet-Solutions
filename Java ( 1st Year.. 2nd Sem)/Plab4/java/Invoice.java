//T_Yehan
package plab.plab4;

import java.util.Scanner;
public class Invoice {
    String partNo, partDes; //part description
    int quantity;
    double price;
    
    public Invoice()
    {
        this.partNo = "null";
        this.partDes = "null";
        this.quantity = 0;
        this.price = 0.0;
    }
    
    public Invoice(String partNo, String partDes, int quantity, double price)
    {
        this.partNo = partNo;
        this.partDes = partDes;
        this.quantity = quantity;
        this.price = price;
    }
    
    ///Only part number is supplied///
    public Invoice(String partNo)
    {
        this.partNo = partNo;
    }
    
    ///Part number & Part Description are supplied///
    public Invoice(String partNo, String partDes)
    {
        this.partNo = partNo;
        this.partDes = partDes;
    }
    
    public Invoice(Invoice i)
    {
        this(i.partNo, i.partDes, i.quantity, i.price);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Invoice i1 = new Invoice();
        System.out.println("\n----------------------------------------");
        System.out.println("Default Constructor");
        System.out.println("----------------------------------------");
        System.out.println("Part No.         : "+i1.partNo);
        System.out.println("Part Description : "+i1.partDes);
        System.out.println("Quantity         : "+i1.quantity);
        System.out.println("Price per item   : "+i1.price);
        System.out.println("----------------------------------------");
        
        Invoice i2 = new Invoice("12");
        System.out.println("\n----------------------------------------");
        System.out.println("Only part number is supplied");
        System.out.println("----------------------------------------");
        System.out.println("Part No.         : "+i2.partNo);
        System.out.println("Part Description : "+i2.partDes);
        System.out.println("Quantity         : "+i2.quantity);
        System.out.println("Price per item   : "+i2.price);
        System.out.println("----------------------------------------");
        
        Invoice i3 = new Invoice("17", "Ultrasonic Sensor");
        System.out.println("\n----------------------------------------");
        System.out.println("Only part no and descripton are supplied");
        System.out.println("----------------------------------------");
        System.out.println("Part No.         : "+i3.partNo);
        System.out.println("Part Description : "+i3.partDes);
        System.out.println("Quantity         : "+i3.quantity);
        System.out.println("Price per item   : "+i3.price);
        System.out.println("----------------------------------------");
        
        Invoice i4 = new Invoice("03", "Coaxial Cable", 8, 3500);
        System.out.println("\n----------------------------------------");
        System.out.println("All are supplied");
        System.out.println("----------------------------------------");
        System.out.println("Part No.         : "+i4.partNo);
        System.out.println("Part Description : "+i4.partDes);
        System.out.println("Quantity         : "+i4.quantity);
        System.out.println("Price per item   : "+i4.price);
        System.out.println("----------------------------------------");
        
        Invoice i5 = new Invoice(i4);
        System.out.println("\n----------------------------------------");
        System.out.println("Object Passed - Invoice 2");
        System.out.println("----------------------------------------");
        System.out.println("Part No.         : "+i5.partNo);
        System.out.println("Part Description : "+i5.partDes);
        System.out.println("Quantity         : "+i5.quantity);
        System.out.println("Price per item   : "+i5.price);
        System.out.println("----------------------------------------");
    }
}
