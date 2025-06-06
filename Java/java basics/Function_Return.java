import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;
public class Function_Return {
    public static int ReadNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int Number = input.nextInt(); 
        return Number;
    }
    public static void GreetUser(){
        System.out.println("\n<<<< Welcome to the Sum Calculator >>>>\n");
    }
    public static void main(String[] args) {
        GreetUser();
        int FirstNum = ReadNumber();
        int SecondNum = ReadNumber();
        int sum = (FirstNum+SecondNum);
        System.out.println("THE  SUM OF GIVEN TWO NUMBERS : "+ sum);
    }
}
 