// WAP to understand the use of String inside the Arrays... 

import java.util.Scanner;

public class Intro_String_Arrays {
    public static void main(String[] args) {
        
    System.out.println("\nDirectly through Size of an Array...\n");
  // Here like number we also store the String in the Array in two ways...
  // 1. By Directly define the size of the Array...
  String[] myStr = new String[5];
  myStr[0] = "First";
  myStr[2] = "Third";
  myStr[1] = "Second";
  myStr[4] = "Fifth";
    // ----- Note: In the Fouth Index we get the value  null because i did'nt declear the String value for "Forth" Index...
    int i_Size = 0;
    while(i_Size < myStr.length){
        System.out.println(myStr[i_Size]);
        i_Size++;

    // Here I use the loop because i want to see all the elements in all the index that WE CALL IN GENRAL IS "ARRAY TRAVERSAL"
    }

  // 2. By Directly Declearing the elements inside the Array...
        System.out.println("\nDirectly Declearing the elements inside the Array\n");
        String[] myStr_elements = {"First", "Second", "Third", "Forth", "Fifth"};
        System.out.println(myStr_elements[3]);
        System.out.println(myStr_elements[0]);
    }
}
