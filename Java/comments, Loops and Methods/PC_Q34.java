// WAP to Check weather the number enter by the user is prime or not...

import java.util.Scanner;

public class PC_Q34 {
    public static void main(String[] args) {
        System.out.println(" :::   Prime Number Finder  :::");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        boolean isPrime= isPrime(num);
        if(isPrime){
            System.out.println("This is the Prime Number   ");
        }
        else{
            System.out.println("This is not a prime Number  ");
        }
    }
        public static boolean isPrime(int num){
            int i = 2;
            while(i<num){
               if( num%i==0){
                return false;
               }
               i++;
            }
        return true;
   }
}
