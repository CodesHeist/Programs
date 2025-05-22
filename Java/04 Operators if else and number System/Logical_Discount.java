// WAP TO PROVIDE DISCOUNT TO CHILDREN BELOW 5 YERAS 75%, FEMALE 50% AND AGE 75 ABOVE 25%...
import java.util.Scanner;
public class Logical_Discount {
    public static void main(String[] args) {
        System.out.println("Welcome to Delhi Metro Ticket Fare Discount System....\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Age for discount calculation...");
        float Age = input.nextFloat();
        System.out.print("You Enter Your Age : "+ Age +"\nNow, Choice (True/False) if you are Female : ");
        boolean isFemale = input.nextBoolean();
        System.out.print("You Chose your Gender As : ");
        {if(isFemale==true){System.out.print("Female\n");
        }
        else if(isFemale==false){
            System.out.println("Male\n");
        }
        else{System.out.println("Invaild Input Try Again....");}
        }
        if(Age < 5) {
            System.out.println("You got 75% Discount on Fare...");
        }
        else if(isFemale){
            System.out.println("You got 50% Discount on Total Fare...");
        }
        else if(Age>75 && !isFemale){
            System.out.println("You Got 25% Discount on total Fare...");
        }
        else{
            System.out.println("You got No Discount...");
        }
    System.out.println("Thanks For using Delhi Metro Service...\n");

    }
}
