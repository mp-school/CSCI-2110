package A3;
import java.util.*;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;
public class looseCode {
    

    // prints file
    public static void main(String[] args){
        
        try{
        File reader = new File("/Users/meganpicard/Documents/CSCI-2110/A3/nhlstats.txt");
        Scanner in = new Scanner(reader);

        while (in.hasNextLine()) {
          String data = in.nextLine();
          System.out.println(data);
        }

        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    
        
        }
















}
}