// WAP to print the multiplication table of 19...
import java.util.Scanner;
public class MutiplicationTable {
    public static void main(String[] args) {
        GreetUser();
        Table();
    }
    public static void GreetUser(){
        System.out.println("\nWelcome to multiplication table of 19\n");
    }
    public static void Table(){
        int Num = 1;
        while(Num<=10){
        System.out.println("19 X "+Num+" = "+ Num*19);
            Num++;
        }
    }
}
