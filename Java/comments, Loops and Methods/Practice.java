// WAP to practice the loops and patterns that is Right half pyramid in java...

public class Practice {
   public static void main(String[] args) {
    // patterns01();  //function calling right half pyramid...
    // patterns02();  //function calling reverse right half pyramid...
    patterns03();
   } 
   // function of right half pyramid... 
   
   public static void patterns01(){
    int rows=0;
    while (rows<5) {
        System.out.print("*");
        int i = 0;
        while (i<rows) {
            System.out.print(" *");
            i++;
        }
        System.out.println();
        rows++;
    }
   }
   // Function of Reverse right half pyramid...
    public static void patterns02(){
    int rows = 0;
    while(rows<5){
    System.out.print("*");
        int i = 4;
        while(i>rows){
            System.out.print(" *");
            i--;
        }
        System.out.println();
    rows++;

    }
  }
  public static void patterns03(){
    int rows = 5;
    while (rows>0) {
        System.out.print("* ");
        int i = 1;
        while(i<rows){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        rows--;
    }
  }

}
