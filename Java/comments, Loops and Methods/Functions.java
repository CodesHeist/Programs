// writing the program to make different function and undrestand the concept of function....


public class Functions {
    public static void main(String[] args) {
        // System.out.println("Calling the function from main mathod...");
        // greetUser();
        // System.out.println("calling the function is completed... ");

        rightHalfPyramid();

    }
       
    public static void greetUser(){
            System.out.println("GOOD MORNING // greetUser function is called....");  
    }
    public static void rightHalfPyramid(){
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");

        int rows = 0;
        while(rows<5){
            System.out.print("*");
            int i=0;
            while (i<rows) {
                System.out.print(" *");
                i++;
            }
            rows++;
        System.out.println( );
        }

    }

}
