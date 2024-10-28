package Labs.Lab6;
// Megan Picard
// B009393548


import java.util.*;



public class ex2 {
    public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);

    System.out.print( "Enter a positive integer: ");
        
         int n = in.nextInt();
         countDown(n);

    }

    public static void countDown(int n){
       
        if (n == 0) { // base case
            System.out.println("BlastOff!");
        
        } else { // glue case
            System.out.print(n + "   ");
            countDown(n - 1);
        }
    }






}
