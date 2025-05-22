// WAP to determine that Enter Year is an Leap Year also Year not divisible by 100...
import java.util.Scanner;
public class PC_Q18 {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year Calculator.... \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Year to chack : ");
        int Year = input.nextInt();
        if((Year % 4 == 0) && Year % 100 != 0 || Year % 400 == 0 ) {
            System.out.println("You Enter a leap Year ...");
        }else{
            System.out.println("This is not a Leap Year...");
        }

    }
}
