public class Arrays_Null {
    public static void main(String[] args) {
        int[] myArr = new int[7];
        myArr[0] = 23;
        myArr[1] = 76;
        myArr[4] = 3;
        myArr[6] = 89;
        // Arrays Traversal since all the items or elements present in the array is call at ones...
        System.out.println("\nArray Traversal....\n");
        int i = 0;
        while(i<myArr.length){
            System.out.println(myArr[i]);
            i++;
        }
        // Arrays Elements are calling Directly one by one...
        System.out.println("\nCalling the elements one by one...\n");
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
        System.out.println("\nEnd of the program...\n");
    }
}
