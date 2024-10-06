package Labs.Lab4; // comment out when handing in

// Full Name: [Megan Picard]
// ID Number: [B00939548]
// Bubble Sort

import java.util.*;
import java.util.stream.IntStream; // for randomizing

//TO DO
 //prompt the user to enter the value of n
 //create an integer array of size n with random integers
 //the range of random integers is from 1 to n

 /* 
        
        Time Complexity
        100 = 0ms
        1000 = 7ms
        10000 = 84ms
        100000 = 11183ms

 */ 
 

public class BubbleSort{

 public static void main(String[] args){
 
  // ui
    Scanner in = new Scanner(System.in);
    System.out.println(" ");
    System.out.println(" - - - Bubble Sort - - - ");
    System.out.println(" ");

    while(true){
    System.out.println(" ");
    System.out.print("Input Array Size: ");
    

    int n = in.nextInt(); // n array size

    // randomized array 0 - n
    int[]  randomArr = IntStream.generate(() -> new Random().nextInt(n+1)).limit(n).toArray();


    // no sort print
    System.out.print("Non-Sorted Array: "); 
    System.out.print(Arrays.toString(randomArr)); 
    System.out.println(" ");

    // excution -> start
    long startTime, endTime, executionTime;
    startTime = System.currentTimeMillis();

    sort(randomArr); // call sort method

    // excution  -> end
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;

    // sort print
    System.out.println(" ");
    System.out.print("Sorted Array: ");
    System.out.print(Arrays.toString(randomArr)); 
    System.out.println(" ");
 

    // excution time print
    System.out.println(" ");
    System.out.print("Excution Time: "); 
    System.out.print(executionTime); 
    System.out.print(" ms"); 

    }


}
public static int[] sort(int[] arr){ // SORT METHOD

 for (int k = 1; k < arr.length; k++) {

  /* 
   Perform the kth pass through the array.
   With each pass, the largest element gets placed in its final position.
   Therefore, we can reduce the range of the inner loop by k, as the last k elements are
  already sorted. 
  */

    for (int i = 0; i < arr.length - k; i++) {
      // Compare adjacent elements in the array.
      // The inner loop iterates through the unsorted part of the array.

        if (arr[i] > arr[i + 1]) {

          // If the current element is greater than the next element, swap them.
          // This "bubbles" the larger element up towards the end of the array.
            int x = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = x;
            
         }
       }
 

    }

   return arr; // return sorted array

  }




}