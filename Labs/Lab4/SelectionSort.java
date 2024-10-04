package Labs.Lab4;

import java.util.*;
import java.util.stream.IntStream; // randomizing

public class SelectionSort {

    public static void main(String[] args){
 
        Scanner in = new Scanner(System.in);
    
        while(true){
        System.out.println(" - - - Selection Sort - - - ");
        System.out.println(" ");
        System.out.print("Input Array Size: ");
        int n = in.nextInt(); // n array size
    
        // randomized array 0 - n
        int[]  randomArr = IntStream.generate(() -> new Random().nextInt(n-1)).limit(n-1).toArray();
    
    
        // no sort
        System.out.print("Non-Sorted Array: "); // test
        System.out.print(Arrays.toString(randomArr)); // test
        System.out.println(" ");
    
        // sort
    
        // excution -> start
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();
    
        sort(randomArr); // call sort method
    
        // excution  -> end
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
    
        System.out.println(" ");
        System.out.print("Sorted Array: "); 
    
        System.out.print("[");
        for(int i=0; i < randomArr.length; i++){
            System.out.print(randomArr[i] + ", ");
        }
    
        System.out.print("]");
        System.out.println(" ");
    
    
        System.out.println(" ");
        System.out.print("Excution Time: "); // test
        System.out.print(executionTime); // test
        System.out.print(" ms"); // test
        System.out.println(" ");
       
        }
    }


    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = i;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = j;
                }
            }

            // If a new minimum is found,
            // swap it with the element at index i
            if (min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

        return arr;

      }




 }