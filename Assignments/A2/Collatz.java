/*
 * By Megan Picard
 * B00939548
 * 
 */

package Assignments.A2;

import java.util.*;
public class Collatz{
public static void main(String[] args){
Scanner in = new Scanner(System.in); // scanner class
//Start with n integer
//ui
System.out.print("Enter a positive integer: ");
//vars
long n = in.nextLong();
long startNum = 0;
int biggest = 0;
int biggestN = 0;
if(startNum < 0){ // if - says an error message and breaks
    System.out.println("Invalid Number, Please Enter A Postive Integer");
}

// excution -> start
long startTime, endTime, executionTime;
startTime = System.currentTimeMillis();

// Looping
for (int i = 1; i <= n; i++){
    startNum = i;
    int count = 0;
    /* Part 1
    if (startNum == 1){
        System.out.println("The Collatz sequence for n = " + i);
    } else{
        System.out.print("The Collatz sequence for n = " + i + " -> ");
    }
    */
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
    if (count > biggest){
        biggest = count;
        biggestN = i;
    }
    /*  Test
        System.out.println(count);
        System.out.println(biggest);
        System.out.println(biggestN);
    */
    }

       // excution  -> end
       endTime = System.currentTimeMillis();
       executionTime = endTime - startTime;
    
    // print out
    System.out.print(n + " " + biggestN + " " + (biggest + 1) + " " + executionTime);
}
}
    /*
     *  TO DO
     *  - P1 Done
     *  - P2 Done
     * 
     * 
     * 
     * 
     */

      /*
     *  TEST CASES
     *  
     * 5: 5 3 8 0 ✓
     * 100: 100 97 119 1 ✓
     * 1000: 1000 871 179 2 ✓
     * 10000: 10000 6171 262 11 ✓
     * 100000: 100000 77031 351 22 ✓
     * 1000000: 1000000 837799 525 243 ✓
     * 10000000: 10000000 8400511 686 2437 ✓
     * 
     */

