package plab.plab2;

import java.util.Scanner;

public  class Stock {
    Scanner in = new Scanner(System.in);
    
    String symbol, name;
    public static double previousClosingPrice, currentPrice;
    
    public Stock(String name, String symbol) //Constructing object
    {
        this.name = name;
        this.symbol = symbol;
    }
    
    public double getChangePercent(){
        System.out.print("Enter the Previous Closing Price : ");
        previousClosingPrice = in.nextDouble();
        System.out.print("Enter the Current Price : ");
        currentPrice = in.nextDouble();
        
        return (((currentPrice - previousClosingPrice)*100)/currentPrice);
    }
}
    
