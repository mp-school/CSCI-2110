package Labs.Lab6;
// Megan Picard
// B009393548

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        
        
    System.out.print("Enter a positive integer: ");
        
       
            while (true){ // loop to get n values
                int n = in.nextInt();
                writeVertical(n);
                System.out.println(); 
            }
        
    }

    public static void writeVertical(int n) {
        
        if (n < 10) { // base  case
            System.out.println(n);
            return;

        } else{ // glue case
            writeVertical(n / 10);
            System.out.println(n % 10);
        }
        
    }
}