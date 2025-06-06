import java.lang.*;
public class Func_Patterns{
    public static void main(String[] args) {
        FirstPattern();
    }
    public static void FirstPattern()  {
        int Rows = 1;
        int i =5;
        while(Rows<=5){
            while(i>Rows){
                System.out.print("*");
                i++;
            }
            Rows++;
        }
    }
}