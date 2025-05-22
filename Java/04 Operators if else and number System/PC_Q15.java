// WAP to determine Wheather the number is intered by user is positive, Negative or Zero...
import java.util.Scanner;
public class PC_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number to Check : ");
        float num = input.nextFloat();
        {if(num==0){
            System.out.println("You Enter the Whole Number That is Zero...");
        }
        else if(num>=1){
            System.out.println(num+" : is the Positive Number...");
        }else if(num<=-1){System.out.println(num+" : is the Negative Number...");
    }else{
        System.out.println("You Enter the String Value Please try again and Enter Number ");
    }
    }
    }
}