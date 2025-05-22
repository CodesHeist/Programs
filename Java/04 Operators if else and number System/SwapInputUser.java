// package Java Projects.04 Operators if else and number System;
import java.util.Scanner;
public class SwapInputUser {
    public static void main(String[] args) {
        System.out.println("Welcome to Swapping Station\n \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter the Second number: ");
        int num2 = input.nextInt();
        int num3;
        num3=num1;
        num1=num2;
        System.out.println("The Swapped nos. of First number is: " + num1 );
        num2=num3;
        System.out.println("The Swapped nos. of Second number is: " + num2);
    }
    
}
