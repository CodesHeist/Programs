import java.util.Scanner;
public class OddSum {
    public static void main(String[] args) {
        GreetUser();
        Sum();
    }
    public static void GreetUser(){
        System.out.println("\nPlease enter the number : \n");

    }
    public static void Sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num){
            sum =sum+i;
            i+=2;
        }
        System.out.println("The Sum of all the odd number Till "+num+" is :"+sum);
    }
}
