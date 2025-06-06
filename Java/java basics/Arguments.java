import java.util.Scanner;
public class Arguments {
    public static void main (String []args){
    System.out.println(Addition(32, 43));
    System.out.println(Addition(7, 18));
    System.out.println(add3(12, 18, 30));
    
    }
    public static int Addition(int Num1, int Num2){
        System.out.println("The First number  : "+Num1);
        System.out.println("The Second number : "+Num2);
        int sum = Num1+Num2;
        return sum;
    }
    public static int add3(int num1, int num2, int  num3){
        System.out.println("The First Number  : "+num1);
        System.out.println("The Second Number : "+num2);
        System.out.println("The Third Number  : "+num3);
        int sum = num1+num2+num3;
        return sum;
    }
}
