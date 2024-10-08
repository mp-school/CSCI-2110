package Assignments.A2;
import java.util.*;
public class CousinCollatz2 {
    
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    long n = 1;
    long startNum = 0;

    int biggest = 0;
    int biggestN = 0;

    long startTime = 0;
    long endTime = 0;
    long executionTime = 0;


        // ui print
        System.out.println("Enter a positive integer(s) followed by 0 to end:");


    while (n != 0){
        n = in.nextLong();

    
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
                if (startNum % 4 == 1){
                    startNum = 7 * startNum + 1;
                } else if (startNum % 4 == 3){
                    startNum = 7 * startNum - 1;
                }
            }
               
                count++;
            
        }
        if (count > biggest){
            biggest = count;
            biggestN = i;
        }


        
    }

    // excution  -> end
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;

   
    if (n != 0){
    System.out.println(n + " " + biggestN + " " + (biggest + 1) + " " + executionTime);
}
    }
    }
}
