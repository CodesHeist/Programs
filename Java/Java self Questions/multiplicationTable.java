import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        GreetUser();
        UserInput();

    }
    public static void GreetUser(){
        System.out.println("\nWelcome to Table Calculator : \n");
    }
    public static void UserInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        int userNum = input.nextInt();
        int num = 1;
        while(num<=10){
            System.out.println(userNum+" X "+num+" = "+num*userNum);
            num++;
        }

    }
}
