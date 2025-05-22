// WAP to take the input from user and apply the bitwise OR operator and check result...
import java.util.Scanner;
public class PC_Q23 {
    public static void main(String[] args) {
        System.out.println("Checking the bitwise XOR Operator...\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number : ");
        int First = input.nextInt();
        System.out.print("Now, Please Enter the Secend Number : ");
        int Secend = input.nextInt();
        int Result = First ^ Secend;
        System.out.println("The result of the Bitwise XOR operation is : " + Result);

    }
}
