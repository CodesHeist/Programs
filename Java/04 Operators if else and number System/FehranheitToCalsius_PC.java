// WAP to Calcuate the fehranheit to Calsius 'C=('F-32)*5/9 also take the input from the user for F...

import java.lang.*;
import java.util.Scanner;

public class FehranheitToCalsius_PC {
    public static void main(String[] args) {
        System.out.println("Welcome to Fehranheit to Calsius Calculater : \n \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Fehranheit \'F\' : ");
        float F = input.nextFloat();
        float C = ((F-32)*5/9);
        System.out.print("Calculating Calsius \'C\'..... \n");
        System.out.println("Calculated C : " + C + " Degree Calsius");
        System.out.println("Calculation Done... Program End...");

    }
}