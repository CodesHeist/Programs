// Calculates the total cost (price × quantity) 
// and applies a 10% discount if the total cost exceeds 100.

import java.util.Scanner;

public class grok01 {
    public static void main(String[] args) {
    System.out.println("Welcome to Total Discount Calculator :\n");
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter The Price of the One Product : ");
    float Price = input.nextFloat();
    System.out.print("Please Enter The Total Quantity of the Product : ");
    float Quantity = input.nextFloat();
    float Total_Price = Price * Quantity;
    if(Total_Price>100){
        System.out.println("You Got Extra 10 percent Discount on the Total Cost of the Product...");
        float discount = Total_Price/100*90;
        System.out.println("Now your new Discounted price : "+ discount);
    }else{
    System.out.println("You dont Get any discount Please make your bill above 100 for Discount...");
    System.out.println("The total bill of the Products : "+ Total_Price);
    }
}
}