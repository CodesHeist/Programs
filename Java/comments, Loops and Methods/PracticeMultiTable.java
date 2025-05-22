// WAP to print Multiplication Table also take the input from user...
import java.util.Scanner;
public class PracticeMultiTable {
public static void main(String[] args) {
    GreetUser();
    Table();
}
public static void GreetUser(){
System.out.println("\nWelcome to the World to Multiplication Tables : \n\n");
}
public static void Table(){
    Scanner  input = new Scanner(System.in);
    System.out.print("Please Enter the Number : ");
    int UserInput = input.nextInt();
    int Number = 1;
    while(Number<=10) {
        System.out.println(UserInput+" X "+Number+" = "+(UserInput*Number));
        Number++;
    }
}
}