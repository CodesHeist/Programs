import java.util.Scanner;
public class UserInputSum {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the First number:");
    int num1 = input.nextInt();
    System.out.println("Enter the Second Number");
    int num2 = input.nextInt();
    System.out.println(num1+num2); 
}
}