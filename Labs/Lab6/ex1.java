package Labs.Lab6;
// Megan Picard
// B009393548


import java.util.*;

public class ex1{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);


    // fact
    System.out.println(" ");
    System.out.println(" - - - - - - - - - - - - - - - - - - - ");
    System.out.println("Factorial of a number");
    System.out.print( "Enter a positive integer: ");
    double input = in.nextDouble();
   

    System.out.println(" The factorial of " +  input +  " is "  + fact(input));

    System.out.println(" - - - - - - - - - - - - - - - - - - - ");
    // expo

    System.out.println(" ");
    System.out.println("Power of a number");
    System.out.print( "Enter a positive integer x: ");

    double x = in.nextDouble();

    System.out.print( "Enter another positive integer: ");
    double n = in.nextDouble();

    

    System.out.println(x + " to the power of  " + n + " is " + Math.pow(x, n));

    System.out.println(" - - - - - - - - - - - - - - - - - - - ");

    }
    //Factorial

        public static double fact(double input){

            if (input == 0){

                return 1;
            } else {
                return input * fact(input - 1);
            }


        }



    //Fib nums

    public double[] fib(double input){

        double fibNumbers[] = {5};

        return fibNumbers;



    }


    //Exponents

    public static double expo(double x, double n){
        
       if (n == 0){
        return 1; // base case

       } else {
        return Math.pow(x, n); // glue case
       }
        

    }

       

    }





    













