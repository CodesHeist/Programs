// WAP to Unterstand the concept of patterns(left to right) in java language...

public class Patterns03 {
    public static void main(String[] args) {
       int rows = 0;
       while(rows<5){
        System.out.print("*");
        int col = 4;
        while (col>rows) {
            System.out.print(" *");
            int i = 0;
            while (i<rows) {
                System.out.print("* ");
                i++;
            }
            col--;
        }
        System.out.println();
        rows++;

       } 
    }
}
