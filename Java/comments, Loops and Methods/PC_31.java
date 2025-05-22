//WAP that computes the sum of the digits enter by the User...
import java.util.Scanner;
public class PC_31 {
    public static void main(String[] args) {
        GreetUser();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        int sum = SumOfDigits(num);
        System.out.println("The Sum of Digits is : "+ sum);

    }
    public static void GreetUser(){
        System.out.println("Some Of Digits Calculator : ");
    }
    public static int SumOfDigits(int num){
    int sum = 0;
    while(num>0){
    sum += (num%10);
    num/=10;
    }
    return sum;
    }
}
