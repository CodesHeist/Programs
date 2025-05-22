// WAP to make an Atm Software....

import java.util.Scanner;
public class Atm {
    public static void main(String args[]){
        System.out.println("Please Insert Your Card : ");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Hdfc Bank\nPlease Enter Your ATM Pin : ");
        int Pin = input.nextInt();
        if(Pin==9525){
            // we are into the if Statement Because User Enter the Correct Pin...
        System.out.print("Please select from the below options...\n1.Balance Check\n2.Cash deposit\n3.Cash Widhrawal\n4.Pin Generation\n5.Reset Internet Banking password");
        int UserInput = input.nextInt();
        if(UserInput==1){
            System.out.print("Please Select form the option below...\n1.Savings Account\n2.Current Account\n3.Credit Account");
            int bal = input.nextInt();
            if (bal == 1){
                System.out.println("Your Current Avilable Balance in your Savings Account is 15000 ");
            }else if(bal == 2){
                System.out.println("Your Avilable Balance in Your current Account is 3000...");
            }else if(bal==3){
                System.out.println("You dont have the Credit Account with us...");
            }else{System.out.println("Invaild Input Please Try Again...");}
        }else if(UserInput==2){
            System.out.print("Please Enter the Amount to Deposit...");
            float Amt =  input.nextFloat();
            System.out.println("Your Updated Account Balance : "+(15000+Amt));
        }else if(UserInput==3){
            System.out.print("Please Enter the Amount to Widhrwal from the Account : ");
            float WidAmt = input.nextFloat();
            if(WidAmt>=15000){
            System.out.println("Your Updated Account Balance : "+(15000-WidAmt));
        }
        }
        
    
    }else{System.out.println("Incorrect ATM PIN Please Enter the correct ATM PIN...");}
    }
}
