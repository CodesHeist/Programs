// WAP to take the input from user as parameters and print the output using method in java...
import java.util.Scanner;
public class PracticeParameters {
    public static void main(String[] args) {
        GreetUser();
        int num = SumOfTwoNumbers(UserInput(),UserInput());
        System.out.println(num);
        
    }
    public static void GreetUser(){
        System.out.println("Welcome to the Addition calculator : \n\n");
    }
    public static int SumOfTwoNumbers(int First, int Second){
        int sum = (First + Second);
        return(sum);
    }
    public static int UserInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int Number = input.nextInt();
        return(Number);
    }
}
