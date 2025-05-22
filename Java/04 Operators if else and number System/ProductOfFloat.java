// package Java Projects.04 Operators if else and number System;

// WAP to create the product of two floating point numbers.

import java.lang.*;
import java.util.Scanner;
public class ProductOfFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float num1 = input.nextFloat();
        System.out.print("Now, Enter the Second number : ");
        float num2 = input.nextFloat();
        System.out.println("The product of two Floating nos is : " + (num1*num2));
        
    }
}
