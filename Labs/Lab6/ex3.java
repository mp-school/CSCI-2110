
package Labs.Lab6; // comment out when handing in
// Megan Picard
// B009393548


import java.util.*;
public class ex3 {
    
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);

    System.out.print( "Enter a positive integer: ");
       
        int n = in.nextInt();
        countDown(n);

    }

    public static void countDown(int n){
        
        if (n <= 0) { // base case
            System.out.println("BlastOff!");
        
        } else if (n%2 == 0){ //glue case - even
            System.out.print(n +  "    ");
            countDown(n - 2);
        
        } else{ // glue case - odd
            System.out.print(n +  "    ");
            countDown(n - 2);
        }
        }
    }




