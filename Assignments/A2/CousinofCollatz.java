/*
 * By Megan Picard
 * B00939548
 * 
 */

 package Assignments.A2;

 import java.util.*;

 public class CousinofCollatz{
            
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        //Start with n integer
        
        //ui
            System.out.print("Enter a positive integer: ");
        //vars
            long n = in.nextLong();
            long startNum = 0;
            int biggest = 0;
            int biggestN = 0;

            while(startNum != 1){
                startNum = n;
                int count = 0;
                while(startNum != 1){
                    if(startNum % 2 == 0){
                        startNum = startNum / 2;
    
                        System.out.print(startNum);
                        System.out.print(" ");
                        
                      
                    }else{
                            if (startNum%4 == 1){
                                startNum = 7*startNum + 1;
                                System.out.print(startNum);
                                System.out.print(" ");

                            } if (startNum%4 == 3){
                                startNum = 7*startNum - 1;
                                System.out.print(startNum);
                                System.out.print(" ");
                            }
                            }
                            count++;

            }






    }
 }

}