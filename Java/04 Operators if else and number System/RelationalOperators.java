// Here we try different relational operators...

import java.util.Scanner;
public class RelationalOperators {
    public static void main(String[] args) {
        // here in our 01 program we check the age of the applicent who appleid for the driver license...
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Full Name :");
        String Name = input.nextLine();
        System.out.print("Hello, "+Name+"\nNow, Please Enter Your age for Drivers License....: ");
        float Age = input.nextFloat();
        if(Age>=18){
            System.out.println("You Are Eligible to Apply for Drivers license...");
        }
        else if(Age<18) {
            System.out.println("You are Not Eligible to apply for Driver License at Age :"+ Age);
        }
        else {
            System.out.println("Invalid Input Age Try Again...");
        }
        System.out.println("Program Exicuted Successfully");
    }
}
