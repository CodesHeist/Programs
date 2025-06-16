// WAP to call multiple All index values from single input using loops in case of an Arrays...

import java.util.Scanner;
public class Array_Traversal {
public static void main(String[] args) {
    int[] myArr = new int[5];
    myArr[1] = 23;
    myArr[4] = 5;
    myArr[0] = 43;
    myArr[3] = 77;
    myArr[2] = 1;
    int i = 0;
    while(i<=myArr.length){
        System.out.println(myArr[i]);
        i++;
        }
    }  
}