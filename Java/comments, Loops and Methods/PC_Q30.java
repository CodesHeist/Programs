//WAP to calculate the Factorial of the Number...
import java.util.Scanner;
public class PC_Q30 {
   public static void main(String[] args) {
      GreetUser();
   Scanner input = new Scanner(System.in);
   System.out.print("Please Enter the Number : ");
   int num = input.nextInt();
   long fact = Factorial(num);
   System.out.println("The Factorial of the number is : "+fact);

   }
   public static void GreetUser(){
      System.out.println("Welcome to Factroial Calculator :  \n");
   }
   public static long Factorial(int num){
   if(num<2){
      return 1;
   }
   else{
      long fact = 1;
      int i = 1;
      while(i<=num){
         fact *= i;
         i++;
      }
      return fact;
   }
   }
}
