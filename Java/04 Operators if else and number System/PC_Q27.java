//WAP and take the input from the user and check the number enter by user is even of odd using Bitwise operator...
import java.util.Scanner;
public class PC_Q27 {
    public static void main(String[] args) {
        System.out.println("Checking the Even and Odd Numbers using Bitwise Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int number = input.nextInt();
        if((number&1)==1){
        System.out.print("You enter the ODD Number...");
        }else{
            System.out.println("You Enter the EVEN Number... ");
        }
    }
}
