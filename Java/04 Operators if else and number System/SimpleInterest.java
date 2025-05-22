
// WAP to Calculate the Simple Interest also taking the input from the user for PRT

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Please Enter the PRT for Simple Interest Calculation :\n \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Principle \'P\' : ");
        float P = input.nextFloat();
        System.out.print("Now, Enter the Rate of Interest \'R\' :");
        float R = input.nextFloat();
        System.out.print("Now, Please Enter the Time \'T\' ");
        float T = input.nextFloat();

        System.out.println("Here Simple Interest = "  +(P*R*T)/100);
    }
}
