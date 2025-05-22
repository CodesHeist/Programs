// WAP to determine the Greatest of three nuumber take the input from the user..
import java.util.Scanner;
public class PC_Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Three Numbers : ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        if(num1>num2 && num1>num3){
            System.out.println("First Number you Enter is Greatest among all the three NUmbers...");
        }else if(num2>num3){
            System.out.println("Second Number you enter is Greatest among all the three numbers...");
        }else{System.out.println("Third number is greatest among all the three numbers...");}
    }
}
