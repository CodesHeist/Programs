//WAP to determine Wheather the Input Enter by the user is even or Odd..
import java.util.Scanner;
public class PC_Q16 {
    public static void main(String[] args) {
        System.out.println("Check the Number (Even/Odd) : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Number : ");
        int Number = input.nextInt();
        if(Number % 2 == 0 ){
            System.out.println("the number is Even...");
        }
        else{
            System.out.println("You Enter the Odd Number...");
        }
    }
}
