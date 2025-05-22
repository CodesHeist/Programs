//WAP to print the the multiplication table and take the input from the user....
import java.util.Scanner;
public class PC_Q28 {
    public static void main(String[] args) {
        Greetings();
        Table();
    }
    public static void Greetings(){
        System.out.println("Welcome to Table Calculator : \n");
    }
    public static void Table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number : ");
        int num = input.nextInt();
        
        int i = 1;
        while(i<=10){
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;

        }
    }
}
