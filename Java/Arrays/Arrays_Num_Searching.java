// WAP to Search Elements from the array list and
// if found return the value as found in the array...

import java.util.Scanner;

public class Arrays_Num_Searching {
    public static void main(String[] args) {
        GreetUser();
        int[] myArr = {3,55,77,88,34,45,56,78,36,575,6,54,24,23,52,465,676,67,179,255,457,99,76,345,64,69,4,73,95,38,65};
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number to Search from the array list... ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr, num);
        if(isFound){System.out.println("The Number you enter is found in the array list...");}
        else{System.out.println("The Number you enter is not in the Array list");}

    }
    public static void GreetUser(){
        System.out.println("\nWelcome to Array Searching\n");
    }
    public static boolean isFound(int[] myArr , int num){
        int index = 0;
        while(index<myArr.length){
            if(myArr[index]==num){
                System.out.println("Number is Found in the Array...");
                return true;
            }
            index++;
        }
        return false;
    }

}
