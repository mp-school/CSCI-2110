package Labs.Lab6;
// Megan Picard
// B009393548

import java.util.*;

public class ex1{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    // Ui
    System.out.println("Excerise 1 : 2110");

    // fact
    System.out.println("- - - - - - - - - - - - - - - - - - - ");
    System.out.println("Factorial of a number");
    System.out.print( "Enter a positive integer: ");
    int fact = in.nextInt();
   

    System.out.println("The factorial of " +  fact +  " is "  + fact(fact));

    System.out.println("- - - - - - - - - - - - - - - - - - - ");
    


    // fib
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - ");
    System.out.println("Fibonacci numbers");
    System.out.print( "The first 20 numbers in the Fibonacci series are ");
    
    

    int i = 0;
    while (i < 20){
        System.out.print(fib(i) + ", ");
        i++;
       }


   

    System.out.println(" ");
    System.out.println( "- - - - - - - - - - - - - - - - - - - ");
  



    // expo

    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - ");
    System.out.println("Power of a number");
    System.out.print( "Enter a positive integer x: ");

    int x = in.nextInt();

    System.out.print( "Enter another positive integer: ");
    int n = in.nextInt();

    

    System.out.println(x + " to the power of " + n + " is " + power(x, n));

    System.out.println("- - - - - - - - - - - - - - - - - - - ");

    }
    //Factorial

        public static int fact(int input){

            if (input == 0){
                return 1;
            
            } else {
                return input * fact(input - 1);
            }


        }



    //Fib nums

    public static int fib(int input){

        if (input ==0){
           return 0;

        } else if (input == 1){
            return 1; 

        } else {
            return fib(input-1) + fib(input-2); //glue case
        }
         


    }


    //Exponents

    public static int power(int x, int n){
        
       if (n == 0){
        return 1; // base case

       } else {
        return power(x, n-1)*x; // glue case
       }
        

    }

       

    }





    













