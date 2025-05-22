// WAP to taking multiple user input from the user...
import java.util.Scanner;
public class LoopInput {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Userinput = 1;
    while (Userinput<=5) {
        System.out.print("Please Enter the "+Userinput+" number : ");
        int i = input.nextInt();
        Userinput++;
    }
 }   
}
