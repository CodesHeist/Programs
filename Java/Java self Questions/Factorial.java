import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        GreetUser();
        Fact();
    }
    public static void GreetUser(){
        System.out.println("Welcome to Factorial Calculator : \n");
    }
    public static void Fact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int UserNum = input.nextInt();
        if(UserNum<2){
        System.out.println("Factorial till Number "+UserNum+ " is : 1");
        }
        else{
        int num = 1;
        int i = 2;
        while(i<=UserNum){
            num*=i;
            i++;
        }
        System.out.println("Factorial till Number "+UserNum+" is : "+ num);
    }
    }
}
