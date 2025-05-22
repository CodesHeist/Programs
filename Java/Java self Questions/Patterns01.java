// WAP to Unterstand the concept of patterns(Right to left) in java language...

public class Patterns01 {
    public static void main(String[] args) {
        LeftTORight();
    }
    public static void LeftTORight(){
        int rows = 0;
        while(rows<7){
            int col = 0;
            System.out.print("*");
            while(rows>col){
                System.out.print(" *");
                col++;
            }
            System.out.println();
            rows++;
        }

    }
}
