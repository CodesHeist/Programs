// WAP to Exicutte Right Half Pyramid using Loops....


public class RightHalfPyramid {
    public static void main(String[] args) {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            rows++;
        System.out.println();
        }
    }
}
