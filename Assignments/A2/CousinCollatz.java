/*
 * By Megan Picard
 * B00939548
 * CousinCollatz
 */
package Assignments.A2; // comment out when handing in
import java.util.*;
public class CousinCollatz {
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    long n = 1;
    long startNum = 0;

    // store sequnce vars
    int longSeqLength = 0;
    int longSeq = 0;

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
                
            if (startNum % 4 == 1){ // 7n+1
                    startNum = 7 * startNum + 1;


                } else if (startNum % 4 == 3){ // 7n-1
                    startNum = (7 * startNum - 1);
                }

        }
               
                count++; // how many times loop runs
            
        }

        // if count is bigger the longest sequnce length make count equal to longseqlength
        // and longest squence var to i
        if (count > longSeqLength){  
            longSeqLength = count;
            longSeq = i;
        }

        
    }

    // excution  -> end
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;

   
    //print according to assign 2 criteria 
    if (n != 0){
    System.out.println(n + " " + longSeq + " " + (longSeqLength + 1) + " " + executionTime);
}
    }
    }
}


/*]

Test Cases 

5 100 1000 10000 100000 150000 180000 190000 0

5 3 14 0
100 70 327 0
1000 801 1012 5
10000 9087 1145 9
100000 98003 1552 104
150000 144613 1682 133
180000 157571 2021 162
190000 180081 2025 173
 */