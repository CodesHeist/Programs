// WAP to understand the concept of 2 Dimentional Arrays...

public class Arrays_2D {
    public static void main(String[] args) {
        System.out.println("\nHere I Declear the 2D Array With Size\n");

    /*  What [2][3] Actually Means
        The first number [2] represents the number of rows.
        The second number [3] represents the number of columns per row.
    */
        
    // Also the [2] or [3] represent  the size of the array not the index staring or end point...
        
    int[][] myArr = new int[2][3];
        myArr[0][0] = 9;
        myArr[0][1] = 8;
        myArr[0][2] = 7;
        myArr[1][0] = 6;
        myArr[1][1] = 5;
        myArr[1][2] = 4;
    // Note : Here we Directly Declearing the Size of the array...
    
    
    int Arr_Size_Rows = 0;
    while(Arr_Size_Rows < myArr.length){
        int Arr_Size_col = 0;
        while(Arr_Size_col<myArr[Arr_Size_Rows].length){
        System.out.print(myArr[Arr_Size_Rows][Arr_Size_col]+" ");
        Arr_Size_col++;
        }
        System.out.println();
        Arr_Size_Rows++;
        }
        System.out.println("\nHere we directly Declear the value of Array Elements...\n");
        int[][] myNewArr = {{2,4,5},{9,8,7}};
        // Now Accesing the data inside the 2D Array using the while loop...
        int rows = 0;
        while(rows<myNewArr.length) {
            int col =  0;
            while(col<myNewArr[rows].length){
                System.out.print(myNewArr[rows][col]+ " ");
                col++;
            }
            System.out.println();
            rows++;
        }
    }
}
