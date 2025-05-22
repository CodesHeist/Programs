// WAP to take the input from user and apply the bitwise OR operator and check result...

import java.util.Scanner;
public class PC_Q22 {
    public static void main(String[] args) {
        System.out.println("checking the Bitwise OR operator...\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number : ");
        int Number1 = input.nextInt();
        System.out.print("Now, Please Enter the Secend Number : ");
        int Number2 = input.nextInt();
        int Result = Number1 | Number2;
        System.out.println("The Result of the Bitwise OR Operation is "+ Result);
    }
}
