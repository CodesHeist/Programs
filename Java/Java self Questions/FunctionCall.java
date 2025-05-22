import java.util.Scanner;
public class FunctionCall {

    public static void main(String[] args) {
        GreetUser();
        System.out.println("\n");
        int First = InputUser();
        int Second = InputUser();
        int Addition = First + Second;
        System.out.println("THE SUM OF TWO NUMBERS : "+Addition);
    }
    public static void GreetUser(){
        System.out.print("\nWelcome to Addition Calculator : \n");
    }
    public static int InputUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int sum = input.nextInt();
        return sum;
    }
}
