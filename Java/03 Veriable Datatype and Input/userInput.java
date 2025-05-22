
import java.util.Scanner;
public class userInput {
public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.print("Please Enter Your Name: ");
    String name = input.nextLine(); // here we are taking the name or String input from the user...
    System.out.println("Good Morning " + name); // output to the user also concatination in between...
    System.out.println(name + ", also tell me about Your Age:");
    int Age = input.nextInt();
    System.out.println("Your Age is " + Age);
}    
}
