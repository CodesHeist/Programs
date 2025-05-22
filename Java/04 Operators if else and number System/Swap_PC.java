//package Java Projects.04 Operators if else and number System;
// Creating a program to Swaping two numbers...
public class Swap_PC {
    public static void main(String[] args) {
        int myInt=77;
        System.out.println(myInt);
        int myNew = 88;
        System.out.println(myNew);
        int myNewInt;
        myNewInt = myInt;
        myInt=myNew;
        System.out.println(myInt); // Output must be same as myNew that is 88
        myNew = myNewInt;
        System.out.println(myNew); // Output must be same as myInt that is 77
    }
}
