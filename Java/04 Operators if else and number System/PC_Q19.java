// WAP to Calculate the Grades Based on marks in percentage...
import java.util.Scanner;
public class PC_Q19 {
    public static void main(String[] args) {
        System.out.println("\nResult Calculator : Calculate marks and Grades...\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Name : ");
        String Name = input.nextLine();
        System.out.print("Welcome,\n"+Name);
        System.out.print("  Please Enter your Roll Number : ");
        int Roll = input.nextInt();
        System.out.println("Your Roll Number : "+Roll);
        System.out.println("\n");
        System.out.print("Please Enter the marks of 5 Subjects : ");
        float sub1 = input.nextFloat();
        float sub2 = input.nextFloat();
        float sub3 = input.nextFloat();
        float sub4 = input.nextFloat();
        float sub5 = input.nextFloat();
        float TotalMarks =sub1+sub2+sub3+sub4+sub5;
        float percentage = (TotalMarks/500)*100;
        System.out.println(Name+"\t\t\tRoll : "+Roll+"\nYour Total Marks : "+TotalMarks+"\t\t Percentage : "+percentage);
        if(percentage>100)
        {System.out.println("Percentage of Marks more than 100 INVALID Marks Please Try Again With Correct Marks");}
        else if(percentage>90){
        System.out.println("You Got A ");
        }else if(percentage>75){
            System.out.println("You Got B ");
        }else if(percentage>60){
            System.out.println("You Got C ");
        }else if(percentage>30){
            System.out.println("You Got D ");
        }else if(percentage<30 && percentage>=0){
            System.out.println("You Got F try again Next Year...");
        }else{System.out.println("Percentage is Less Than Zero Invaild input try Again with Correct data");}
        System.out.println("\nEnd of the program.....\n");
    }
}