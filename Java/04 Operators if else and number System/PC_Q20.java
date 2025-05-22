// Create a program that Categorize persons into different age groups....

import java.util.Scanner;
public class PC_Q20 {
    public static void main(String[] args) {
        System.out.println("\nKnow Your Age Group : \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int Age = input.nextInt();
        if(Age<13 && Age>=0){
            System.out.println("You ara an Child...");
        }else if(Age<20 && Age>=13){
            System.out.println("You are an teen...");
        }else if(Age<60 && Age>=20){
            System.out.println("You are an Adult...");
        }else if(Age>60 && Age<125){
            System.out.println("You are an Senior Citizen");
        }else{System.out.println("Invaild Age Please try again...");}
    }
}
