// WAP to take the input from user and apply the bitwise RightShift operator and check result...
import java.util.Scanner;
public class PC_Q26 {
    public static void main(String[] args) {
        System.out.println("Checking the RightShift Operartion...\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please  Enter the Number For Operation : ");
        int Number = input.nextInt();
        int Result = Number >> 1;
        System.out.println("The Result of the RightShift  Operation is : "+ Result);
    }
}
