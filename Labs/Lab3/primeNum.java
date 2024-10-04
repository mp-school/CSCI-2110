package Labs.Lab3;

import java.util.*;

public class primeNum {

    // use two arrays lists to test primes
    static ArrayList<Integer> primeNumbersList = new ArrayList<>();

    // using Sieve of Eratosthenes Algorithm
    public static void primeChecker(int size) {

        int maxSize = 1000001;

        boolean[] primeCheck = new boolean[maxSize + 1];
        Arrays.fill(primeCheck, true);
        primeCheck[0] = primeCheck[1] = false; // 0 and 1 are not prime

        for (int n = 2; n * n <= maxSize; n++) {
            if (primeCheck[n]) {
                for (int j = n * n; j <= maxSize; j += n) {
                    primeCheck[j] = false;  
                }
            }
        }

        // Store all prime numbers
        for (int m = 2; m <= maxSize; m++) {
            if (primeCheck[m]) {
                primeNumbersList.add(m);
            }
        }
    }

    public static int nthPrime(int n) {
        // Check if the nth prime exists
        return primeNumbersList.get(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        primeChecker(1000001);
        
        
        long n;

        long startTime = System.currentTimeMillis(); // Start timing before the lookup
        while (true) {
            n = in.nextLong();

            if (n == 0) {
                break;
            } else {
                if (n > primeNumbersList.size()) {
                    System.out.println("Error");
                } else {
                    
                    int prime = nthPrime((int)n);
                    long endTime = System.currentTimeMillis(); // End timing after the lookup
                    long executionTime = endTime - startTime; // Calculate execution time

                    System.out.print(n);
                    System.out.print(" " + prime);
                    System.out.println(" " + executionTime);
                }
            }
        }
        
        in.close();
    }
}