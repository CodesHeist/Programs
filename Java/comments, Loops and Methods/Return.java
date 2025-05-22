// WAP to understand the concept of return call...

import java.util.Scanner;
public class Return {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to Calculator...\n");
        greet(); // using the greet function...
        // System.out.print("Please Enter the First Number : ");
        // int First = input.nextInt();
        int First = ReturnNumber();   // using the ReturnNumer Function...
        // System.out.print("Please Enter the Second Number : ");
        // int Second = input.nextInt();
        int Second = ReturnNumber();
        int Sum = First + Second;
        System.out.println("The Sum of Two given Numbers : "+ Sum);
    }
    public static int ReturnNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int Number = input.nextInt();
        return Number;  // Here the function ends. Since when we use the return keyword the compiler thinks it has to return the value...
    }
    public static void greet(){
        System.out.println("Welcome to Calculator...\n");  //Dont have any return type Since we use void keyword here...
    } 

}
