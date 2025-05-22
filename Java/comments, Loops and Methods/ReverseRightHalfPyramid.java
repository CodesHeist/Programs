//WAP to impliment the Reverse Right Half pyramid using While loops...

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        int rows = 5;
        while(rows>0){
        System.out.print("*");
        int i = rows;
        while(i>1){
        System.out.print(" *");
        i--;
        }
        rows--;
        System.out.println();
        }
    }
}
