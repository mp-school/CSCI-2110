package A3;
import java.util.*;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;


public class NHLDemo {
    
public static void main(String[] args){

System.out.print("Input the file path name yoou wish to read in': ");
// use /Users/meganpicard/Documents/CSCI-2110/A3/nhlstats.txt


Scanner in = new Scanner(System.in);

String filein = in.nextLine();

    
     File reader = new File(filein);
     Scanner n = new Scanner(reader);


    

    
    try {
        while (n.hasNextLine()) {
  
            // writes to ouput file
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

     }
    NHLStats obj = new NHLStats();
        
    


    }




    


