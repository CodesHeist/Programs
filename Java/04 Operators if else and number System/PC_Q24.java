// WAP to take the input from user and apply the bitwise NOT/Compliment operator and check result...
import java.util.Scanner;
public class PC_Q24 {
    public static void main(String[] args) {
        System.out.print("Checking the Bitwise Not/Compliment Operator...\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number For Operation : ");
        int Num =  input.nextInt();
        int Result = ~Num;
        System.out.println("The Result of Bitwise NOT Operation is : "+ Result);
    }
}
