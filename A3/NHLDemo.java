package A3;
import java.util.*;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;


public class NHLDemo {
    
public static void main(String[] args){

System.out.print("Input the file path name yoou wish to read in: ");
// use /Users/meganpicard/Documents/CSCI-2110/A3/nhlstats.txt


Scanner in = new Scanner(System.in);


   
String filein = in.nextLine();

try{
    File reader = new File(filein);
    Scanner n = new Scanner(reader);

    while (n.hasNextLine()) {
      String data = n.nextLine();
      System.out.println(data);
    }

    }catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();

    
    }
}

     






        
    


}




    


