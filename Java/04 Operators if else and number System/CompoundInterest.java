//WAP to calculate the Compound interest also taking input from the user for PRt...

import java.lang.*;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Calculate the compound interest with our calculater...\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Principle \'P\' : ");
        float P = input.nextFloat();
        System.out.print("Now, Please Enter the Rate of interest \'R\'");
        float Rate = input.nextFloat();
        System.out.print("Now, Please enter the Time \'T\'");
        float Time = input.nextFloat();
        System.out.println("Your Compound Interest P(1+R/100)T :");
        System.out.println("Compound Interest : " + (P* Math.pow((1+Rate/100),Time)));
        System.out.println("End of the Calculation.......");
    }
}
