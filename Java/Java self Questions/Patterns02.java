// WAP to Unterstand the concept of patterns(Reverse Right to left) in java language...

public class Patterns02 {
    public static void main(String[] args) {
        ReverseR2F();
    }
    public static void ReverseR2F(){
        int rows = 0;
        while (rows<7) {
            System.out.print("*");
            int col=6;
            while(col>rows){
                System.out.print(" *");
                col--;
            }
            System.out.println();
            rows++;
        }
    }
}
