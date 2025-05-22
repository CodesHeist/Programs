// WAP to take the input from user and apply the bitwise and operator and check result...
import java.util.Scanner;
public class PC_Q21 {
    public static void main(String[] args) {
        System.out.println("Checking the bitwise and Operator...\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First Number : ");
        int First = input.nextInt();
        System.out.print("Now, Please Enter the Second Number : ");
        int Second = input.nextInt();
        System.out.println(First & Second);
    }
}
