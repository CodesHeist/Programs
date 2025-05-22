public class ArrayString {
    public static void main(String[] args) {
    // String StrArr[] = new String[5];   // this is the string decleration using index...
    // StrArr[0] = "First";

    String[] StrArr = {"First","Second","Third"};
    // System.out.println(StrArr[0]);   //acc only one index at a time...
    int index = 0;
    while(index<StrArr.length){
        System.out.println(StrArr[index]);
        index++;
    }
    }
}
