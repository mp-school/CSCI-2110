
package Labs.Lab6;
// Megan Picard
// B009393548
import java.util.*;


public class ex8 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    //ui
        System.out.print( "Enter a positive integer: ");
        int n = in.nextInt();

        System.out.println(countWays(n));

    }
    public static int countWays(int n){
        
        if (n == 0) { // base
            return 1;
        }

        if (n < 0) { // base 
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3); // glue
    }


}

