import java.util.Scanner;

public class Arrays_Utility {
    public static int[] InputArray() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Size of the Array : ");
        int Size = input.nextInt();
        int[] myArr = new int[Size];
        int i = 0;
        while(i<Size){
            System.out.print("Please Insert the Value of the Array Elements "+i+" : ");
            myArr[i] = input.nextInt();
            i++;
            
        }
        return myArr;
   }
}
