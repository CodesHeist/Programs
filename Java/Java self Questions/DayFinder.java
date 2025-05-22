//WAP to Find the  Day of the week, Since user only give start date and end date
import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        Greetings();
        // taking the multiple input from the user for the date...
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Date 'DD'  : ");
        int Date = input.nextInt();
        if(Date<=31){System.out.println(Date);}
        else{System.out.println("Please Enter the vaild date...");}
        System.out.print("Please Enter the Month 'MM' : ");
        int Month = input.nextInt();
        if(Month<=12){System.out.println(Month);}
        else{System.out.println("Please Enter the vaild Month...");}
        System.out.print("Please Enter the Year in 'YYYY' : ");
        int Year = input.nextInt();
        System.out.println("\nYour Enterd Date is : "+Date+"."+Month+"."+Year);
        WeekDays();

        //Here we take the output date from the user...
        
        System.out.print("\n\nPlease Enter the End Date 'DD'  : ");
        int oDate = input.nextInt();
        if(oDate<=31){System.out.println(oDate);}
        else{System.out.println("Please Enter the vaild date...");}
        System.out.print("Please Enter the End Month 'MM' : ");
        int oMonth = input.nextInt();
        if(oMonth<=12){System.out.println(oMonth);}
        else{System.out.println("Please Enter the vaild Month...");}
        System.out.print("Please Enter the End Year in 'YYYY' : ");
        int oYear = input.nextInt();
        System.out.println("Your Enterd Date is : "+oDate+"."+oMonth+"."+oYear);


        // Main code concept is applied from here on....

        //For Starting Date...
        System.out.print("Please Enter the Year to chack : ");
        Year = input.nextInt();
        // In Case of Leap Year...
        if((Year % 4 == 0) && Year % 100 != 0 || Year % 400 == 0 ) {
           if(Month>0 & Month<=12){
            if(Month==1){
                int RMJ = 31-Date;
            }
           } 
        }
        // In Case of Normal Year...
        else{
            System.out.println("This is not a Leap Year...");
        }

    }// Main Method ENDS here...






    public static void Greetings(){
        System.out.println("\nWelcome to Day Finder : \n");
    }







    public static void WeekDays(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Chose the WeekDay from the option : 1. Monday 2. Tuesday 3. Wednesday 4. Thursday 5. Friday 6. Saturday 7. Sunday : ");
        int WeekDay = input.nextInt();
        if(WeekDay == 1){
            System.out.println("You Selected Monday");
        }else if(WeekDay == 2){
            System.out.println("You Selected Tuesday");
        }else if(WeekDay == 3){
            System.out.println("You Selected Wednesday");
        }else if(WeekDay == 4){
            System.out.println("You Selected Thursday");
        }else if(WeekDay == 5){
            System.out.println("You Selected Friday");
        }else if(WeekDay == 6){
            System.out.println("You Selected Saturday");
        }else if(WeekDay == 7){
            System.out.println("You Selected Sunday");
        }else{
            System.out.println("Not a vaild input Please try again...");
        }
    }

}
