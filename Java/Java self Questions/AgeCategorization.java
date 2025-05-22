// 20. Create a program that categorize a person into different age groups
import java.util.Scanner;
public class AgeCategorization {
public static void Greeting(){
System.out.println("Welcome to Age Categorize finder : \n");
}
public static void Program(){
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter your Age : ");
    int age = input.nextInt();
    if(age<13 && age >0){
        System.out.println("You are a Child");
    }else if (age>=13 && age<20){
        System.out.println("You are a Teen");
    }else if(age>=20 && age<60){
        System.out.println("You are a Adult");
    }else if(age>=60 && age<160){
        System.out.println("You are a Senior");
    }else{
        System.out.println("Invaild Age Please try Again...");
    }
}

public static void main(String[] args) {
    Greeting();
    Program();
}
}