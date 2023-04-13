package plab.plab5;

public class Test {
    
    public static void main(String[] args) {
        Customer cust = new Customer(12, "Tharindu Yehan", 'M');
        
        System.out.println("------------------------------------");
        System.out.println("Id     : "+cust.getId());
        System.out.println("Name   : "+cust.getName());
        System.out.println("Gender : "+cust.getGender());
        System.out.println("-----------------------------------");
        System.out.println("ToString : "+cust.toString());
        System.out.println("-----------------------------------");
    }
}
