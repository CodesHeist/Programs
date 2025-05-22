// WAP to undrestand the concept of parameters in java...
public class Parameters {
    public static void main(String[] args) {
        greet();
        System.out.println(sumOfTwoNumbers(43,34 ));
        System.out.println(sumOfTwoNumbers(67,-67));
    }
    public static int sumOfTwoNumbers(int First, int Second){
        System.out.print("The First Number is : "+First+"\n");
        System.out.print("The Second Number is : "+Second+"\n");
        int sum = First + Second;
        System.out.print("The sum of the Numbers : ");
        return sum;
    }
    public static void greet(){
        System.out.println("Welcome to Calculator...\n");
    }
}
