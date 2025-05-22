// WAP to find the area of the triangle also taking the input from user for base and height...

import java.lang.*;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the base of the Triangle : ");
        float base = input.nextFloat();
        System.out.print("Now, Please Enter the Height of the Triangle : ");
        float height = input.nextFloat();
        System.out.println("Area of the triangle is : " + 0.5*(base*height));
    }
}
