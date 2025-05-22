// WAP to understand the Concept and implimentation of Array in java program...

public class Arrays {
    public static void main(String[] args) {
        // int[] myArr = new int[10];    // this is 1st way to define array in the java program...
        // myArr[1] = 98;
        // myArr[2] = 2;
        // myArr[3] = 8;
        // myArr[3] = 65;
        // myArr[4] = 37;

        int[] myArr = {98,2,8,65,37};   // this is the 2nd way to define array in java program...
        // System.out.println(myArr[4]);   //We have to use the multiple output statement to print value in the array...
        
        //this is way to print multiple output from single print statement....
        //This also called Array Traversal...
        int i = 0;
        while(i<myArr.length){
            System.out.println(myArr[i]);
            i++;
        }
    }
}
