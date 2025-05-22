import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        GreetUser();
        int arr[] = {9,21,43,45,65,76,90,64,81,54,99,3,8,7,5};
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number you want to Search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("\nThe Number is Found  in the Array...");
        }
        else{
            System.out.println("\nThe Number is not Found in the Array...");
        }

    }
    public static void GreetUser(){
        System.out.println("\n Welcome to the Array Searching : \n");
    }
    public static boolean isFound(int arr[],int num ){
        int index = 0;
        while (index<arr.length) {
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
