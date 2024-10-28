
package Labs.Lab6;
// Megan Picard
// B009393548
import java.util.*;



public class ex7 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    //ui
    System.out.print( "Enter a string to reverse: ");

        String toRev = in.nextLine();
    
    System.out.println(reverseString(toRev));


    }



    public static String reverseString(String str){

        
        if (str.length() <= 1) { // base case
            return str;
        
        } else{ // glue case
            return (reverseString(str.substring(1)) + str.charAt(0));
        }


    }
}
