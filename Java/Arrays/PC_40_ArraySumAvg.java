// WAP to Find the Average and Sum of all the elements present in the Array...

import java.util.Scanner;

public class PC_40_ArraySumAvg {
    public static void main(String[] args) {
        GreetUser();

        int[] NumArr  = Arrays_Utility.InputArray();

        long Sum = Sum(NumArr);
        double Average = Average(NumArr);
        System.out.println("\nThe Sum of the Numbers in the Array is : "+Sum);
        System.out.println("\nThe Average of the Numbers in the Array is : "+Average);

    }   
    public static void GreetUser (){
        System.out.println("\nWelcome to the Array Sum and Average Calculator : \n");
    }
    public static long Sum(int[] NumArr){
        long Sum = 0;
        int i = 0;
        while(i<NumArr.length){
            Sum += NumArr[i];
            i++;
        }
        return Sum;
    }
    public static double Average(int[] NumArr){
        double Sum = Sum(NumArr);

        return (Sum/NumArr.length);
    }
}
