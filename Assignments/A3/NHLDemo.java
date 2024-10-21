package Assignments.A3;

import java.util.*;
import java.io.*;

public class NHLDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = scanner.nextLine();

        NHLStats stats = new NHLStats();

        // use /Users/meganpicard/Documents/CSCI-2110/Assignments/A3/nhlstats.txt
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(line, "\t");
                // Parse the line and create PlayerRecord objects
                // Add PlayerRecord objects to stats
            }
            reader.close();

            // Write results to nhlstatsoutput.txt
            PrintWriter writer = new PrintWriter("Assignments/A3/nhlstatsoutput.txt");
            writer.println("NHL Results Summary");
            
            writer.println("Players with highest points and their teams:");
            writer.flush();
            // Call appropriate method and write results
            
            // Repeat for other statistics...

            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}