package Labs.Lab4; // comment out when handing in

// Full Name: [Megan Picard]
// ID Number: [B00939548]
// Selection Sort

import java.util.*;
import java.util.stream.IntStream; // for randomizing

//TO DO
 //prompt the user to enter the value of n
 //create an integer array of size n with random integers
 //the range of random integers is from 1 to n

 /* 
        
        Time Complexity
        100 = 0ms
        1000 = 4ms
        10000 = 43
        100000 = 1867ms

 */ 
 

public class SelectionSort {

 public static void main(String[] args){
 
    // ui
    Scanner in = new Scanner(System.in);
    System.out.println(" ");
    System.out.println(" - - - Selection Sort - - - ");
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

    for (int i = 0; i < arr.length - 1; i++) {
          
    int minimum = i; // Assume the current element is the minimum

    // look for minimum through the array
        for (int j = i + 1; j < arr.length; j++) { //for j from i+1 to n: // Corrected to go up to n, not n-1
             if (arr[j] < arr[minimum]) { // If we find a smaller element
                  minimum = j; // Update min_index to the new minimum element's index
            }
        }

        // Swap the found minimum element with the element at index i
        if (minimum != i) {
            int x = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = x;
        }
    }

        return arr; // return sorted array

      }




 }
