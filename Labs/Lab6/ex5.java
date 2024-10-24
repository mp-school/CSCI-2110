package Labs.Lab6;
// Megan Picard
// B009393548

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a positive integer: ");
            
            while (in.hasNextInt()){
                int n = in.nextInt();
                writeVertical(n);
                System.out.println(); 
            }
        }
        
         in.close();
    }

    public static void writeVertical(int n) {
        
        if (n < 10) { // base
            System.out.println(n);
            return;

        } else{ // glue
            writeVertical(n / 10);
            System.out.println(n % 10);
        }
        
    }
}