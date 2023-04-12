package plab.plab2;

public class Plab2 {
             
    public static void main(String[] args) {
        
        Stock s = new Stock("Oracle Corporation", "ORCL"); //Overiding the object
        
        System.out.println("Name   : "+s.name);
        System.out.println("Symbol : "+s.symbol);
        
        double changePercent = s.getChangePercent();
        System.out.println("------------------------------------------");
        System.out.println("Price change percentage is "+changePercent);
        
    }
}
 