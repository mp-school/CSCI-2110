/*
 * By Megan Picard
 * B00939548
 * Collatz
 */
package Assignments.A2; // comment out when handing in
import java.util.*;
public class Collatz{
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    long n = 1;
    long startNum = 0;

   // store sequnce vars
   int biggest = 0;
   int biggestN = 0;

   // excution time vars
   long startTime = 0;
   long endTime = 0;
   long executionTime = 0;


    // ui print
        System.out.println("Enter a positive integer(s) followed by 0 to end:");

    while (n != 0){
        n = in.nextLong(); // read in next n

      
    // excution -> start
    startTime = System.currentTimeMillis();
    
    
    // Looping
    for (int i = 1; i <= n; i++){
        startNum = i;
        int count = 0;

      
    while (startNum != 1){
            
        if (startNum %2 == 0){
                // System.out.println("Even"); //TEST
                startNum = startNum / 2;
            
        } else {
               // System.out.println("Odd"); // TEST
                startNum = (startNum * 3) + 1;
             
        }
             if (startNum == 1){
                    // System.out.println(startNum); // Part 1

             } else{
                    // System.out.print(startNum + " -> "); // Part 1
                }

                count++;
            
        }

        // if count is bigger the longest sequnce length make count equal to longseqlength
        // and longest squence var to i
        if (count > biggest){
            biggest = count;
            biggestN = i;
        }


        
    }

    // excution  -> end
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;

   
    //print according to assign 2 criteria 
    if (n != 0){
    System.out.println(n + " " + biggestN + " " + (biggest + 1) + " " + executionTime);
}
    }
    }
}

/*]

Test Cases 

5 100 1000 10000 100000 1000000 10000000 0
5 3 8 0
100 97 119 0
1000 871 179 3
10000 6171 262 7
100000 77031 351 31
1000000 837799 525 358
10000000 8400511 686 2289

 */