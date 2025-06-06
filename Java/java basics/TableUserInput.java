// WAP to take the input From the User through Arguments and print the multiplication table...

import java.util.Scanner;
public class TableUserInput {
    public static void main(String[] args) {
    System.out.println("\n<<< Welcome to the Multiplication Table >>>\n");
    Scanner input  = new Scanner(System.in);
    System.out.print("Please Enter the Number : ");
    int num = input.nextInt();
    table(num);

    
    }
    public static void table(int num){
    int i = 1;
    while(i<=10){
        System.out.println(num+" X "+i+" = "+num*i);
        i++;
    }
    }

    
}
