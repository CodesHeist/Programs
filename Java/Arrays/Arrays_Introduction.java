// WAP to understand the Concept of arrays Implimentaion...

import java.util.Scanner;

public class Arrays_Introduction {
    public static void main(String[] args) {
        System.out.println("\nThe Values in Arrays are Stored through Declearing the Size Directly\n");
        MyArr_Size();
        System.out.println("\nThe Arrays values are Stored through without declearing the varibles\n");
        MyArr_Size();
        System.out.println("\nThe Arrays values are calling using the loop since single input multiple output\n");
        MyArr_Loop();
        System.out.println("\n");


    }
    public static void MyArr_Size(){
    // Declearation of Size of the Array...
    int[] myArr = new int[7];
    myArr[0] = 1;
    myArr[1] = 2;
    myArr[2] = 3;
    myArr[3] = 4;
    myArr[4] = 5;
    myArr[5] = 6;
    myArr[6] = 7;
    
    // Here we calling the values in the Arrays through the Arrays index...
    
    System.out.println(myArr[0]);
    System.out.println(myArr[1]);
    System.out.println(myArr[2]);
    System.out.println(myArr[3]);
    System.out.println(myArr[5]);
    System.out.println(myArr[6]);
    }

    public static void MyArr_Values(){
        // Here we Declearing the values in arrays directly without declaering the variable...
        int[] myArr = {1,2,3,4,5,6,7};

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[5]);
        System.out.println(myArr[6]);

    }

    public static void MyArr_Loop(){
        // Here we call the Arrays value through Loop in Single input multiple Output...
        int[] myArr = {1,2,3,4,5,6,7}; 
        int i = 0;
        while(i<7){
        System.out.println(myArr[i]);
        i++;
        }
    }
    
}