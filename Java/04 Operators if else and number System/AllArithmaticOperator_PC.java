// package Java Projects.04 Operators if else and number System;

// WAP to take the input from the user and use all Arithmatic Operators...

import java.util.Scanner;

public class AllArithmaticOperator_PC {
   public static void main(String[] args) {
    System.out.println("Calculate the Nos...\n \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter the First Number: ");
    int num1 = input.nextInt();
    System.out.print("Now, Enter the Second Number: ");
    int num2 = input.nextInt();
    System.out.println("1.Sum of the nos. is : " + (num1+num2));
    System.out.println("2.Differance of the nos. is : " + (num1-num2));
    System.out.println("3.The multiplication of the number is : " + (num1*num2));
    System.out.println("4.The Division of the nos. is : " + (num1/num2));
    System.out.println("5.The Remender of the nos. is : "+ (num1%num2));
   } 
}
