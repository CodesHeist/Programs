// WAP to sum all odd numbers from 1 to spacified number N...

import java.util.Scanner;
public class PC_Q29 {
    public static void main(String[] args) {
        GreetUser();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number N : ");
        int Number = input.nextInt();
        int Sum = OddSum(Number);
        System.out.println("OddSum Till Number \'n\' "+Number+" is : "+Sum);
    
    }
    public static void GreetUser() {
        System.out.println("\nWelcome to Odd Sum Calculator :\n\n ");
    }
    public static int OddSum(int Number){
        int Sum = 0;
        int i = 1;
        while(i <= Number){
            Sum +=i;
            i += 2;
        }
        return Sum;
    }
}
