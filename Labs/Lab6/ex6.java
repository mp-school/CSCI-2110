package Labs.Lab6;
// Megan Picard
// B009393548

import java.util.*;

public class ex6 {
 
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    System.out.print( "Enter a positive integer: ");
        
        int n = in.nextInt();
    
    System.out.println(squares(n)); 

    }

    public static int squares(int n) {
       
        if (n == 0) { // base case
            return 0;
            
        } else { // glue case
            return (squares(n - 1) + n * n); 
        }
    }


}
