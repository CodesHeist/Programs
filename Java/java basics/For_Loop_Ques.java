public class For_Loop_Ques {
public static void main(String[] args) {
    int num = 5; // 1.In Every iteration the value of num changes...
for(int i=0;i<3;i++){ // 4.In first it 5, In second it 0 and so on...
    if(num%2==0){    // 3.In Second iteration the if condition is true because the value of num=0.
        num+=i;
    }else{   // 2.In first iteration the else condition is true...
        num*=i;
    }System.out.println(num);
    }
}   
}