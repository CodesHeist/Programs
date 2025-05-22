// package Java Projects.04 Operators if else and number System;

// WAP to calculate the perimeter of a Rectangle
// Perimeter of rect ABCD = A+B+C+D
// but i will use the formula 2(Length + breadth)

import java.lang.*;
import java.util.Scanner;
public class PerimeterOfRect {
public static void main(String[] args) {
    System.out.println("Here we Calculate the Perimeter of Rectangle : \n \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length of the Rectangle : ");
    float Length = input.nextFloat();
    System.out.print("Now, Enter the breadth of the rectangle : ");
    float Breadth = input.nextFloat();
    System.out.println("Perimeter of the Rectangle is : " + 2*(Length+Breadth));
}
    
}
