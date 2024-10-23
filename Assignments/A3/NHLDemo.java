// Full Name: [Megan Picard]
// ID Number: [B00939548]
package Assignments.A3; // comment out

import java.util.*;
import java.io.*;

public class NHLDemo {
    public static void main(String[] args) {
     

try {
      File myObj = new File("Assignments/A3/nhlstats.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }











       
    }
}
