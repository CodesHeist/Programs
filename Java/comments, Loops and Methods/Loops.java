// Writing the program to understand the Concept of Loops in java...

import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // System.out.println("Here we are printing from 1 to 10...");
        // int Num = 1;  //inistilization
        // while (Num<=10) //condition
        // {
        //     System.out.println(Num);    //Work or Body
        //     Num=Num+1;
        // }

        // int count = 200;
        // while(count<=200){
        //     System.out.println(count);
        //     count = count-1;
        // }
        Scanner input = new Scanner(System.in);
        int num = 1;
        while(num <= 5){
            System.out.print("Please Enter the 5 Numbers : ");
            int Number = input.nextInt();
            System.out.println("Your Entered Number : "+ Number);
            num +=1;
        }

    }    
}
