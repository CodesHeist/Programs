// WAP to take the input from user and apply the bitwise LeftShift operator and check result...
import java.util.Scanner;
public class PC_Q25 {
    public static void main(String[] args) {
        System.out.println("Checking the Bitwise LeftShift Operation...\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number for LeftShift Operation : ");
        int number = input.nextInt();
        int result = number<<1;
        System.out.println("The Result of the LeftShift Operation is : "+ result);
    }
}
