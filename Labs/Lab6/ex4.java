package Labs.Lab6;
// Megan Picard
// B009393548


import java.util.*;

public class ex4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print( "Enter a positive integer: ");

        int n = in.nextInt();
    
        System.out.print( "Enter another positive integer: ");
        int m = in.nextInt();
        
        multiples(n, m);

    }

    public static void multiples(int n, int m){
        
        if (m == 0){ // base
            return;
        } else {
            multiples(n, m - 1); // glue
        }

        if (m >= 1){
            System.out.print(n * m + ", ");
        } else {
            System.out.print(n * m);
        }
            }
        }



