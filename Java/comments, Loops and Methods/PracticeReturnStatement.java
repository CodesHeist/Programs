// WAP to practice the return statement in java...
import java.util.Scanner;
public class PracticeReturnStatement {
    public static void main(String[] args) {
        GreetUser();
        int sum = (Returnnum() + Returnnum());
        System.out.println(sum);
    }
    public static void GreetUser(){
        System.out.println("Welcome to Sum Calculator : \n");
    }
    public static int Returnnum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int Number = input.nextInt();
        return(Number);
    }
}
