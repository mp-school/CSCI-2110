package Assignments.A1;

//package A1;
// Assignment 1 - Csci 2110
// Author: Megan Picard
//
import java.util.*;
public class GameDemo{
    public static void main (String[] args){
Scanner in = new Scanner(System.in); // Read in
Board board = new Board(); // creating board object
String ui = " "; // ui variable
while(!ui.toLowerCase().equals("exit")){ 
    ui = in.next();
switch (ui.toLowerCase()){
    // break program
    case("exit"): 
        System.out.print("Done.");
    break;
    // help commands list
    case ("help"):
     System.out.println("Possible commands are as follows:");
             System.out.println("create location [fast][flexible]: Creates a new piece.");
            System.out.println("move location direction [spaces]: Moves a piece.");
             System.out.println("print: Displays the board.");
            System.out.println("help: Displays help");
            System.out.println("exit: Exits the program.");
            // orignial enter statement
            System.out.println("Enter a command (type help for details)");
    break;
    // prints board
    case ("print"):
        board.printOutBoard();
        // orignial enter statement
        System.out.println("Enter a command (type help for details)");
    break;
    // gets details for moving pieces
    case ("move"):
        int positionX = in.nextInt();
        int positionY = in.nextInt();
        String direction = in.next();
        int spacesMoved = 0;
    
     Pieces checkPiece = board.getBoard(positionX, positionY);
     // only need spaces moved if fast piece
     if (checkPiece instanceof FastPiece || checkPiece instanceof FastFlexible){
            spacesMoved = in.nextInt();
        } 
        // call move piece method
        board.movePiece(positionX, positionY, direction, spacesMoved);
        // orignial enter statement
        System.out.println("Enter a command (type help for details)");
    break;
 }
// if create is entered it goes based of type to create an object for that class
if (ui.toLowerCase().equals("create")){
      
   int positionX = in.nextInt();
   int positionY = in.nextInt();
   String type = in.nextLine(); 
   
   System.out.println("Input a name for the new piece:");
   String name = in.nextLine();
   
   
   System.out.println("Input a colour for the new piece:");
   String colour = in.nextLine();
			
// creating piece based on type inputed
    if (type.toLowerCase().equals(" fast flexible")){
        FastFlexible gamePiece = new FastFlexible (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);
    } else if (type.toLowerCase().equals(" flexible")){
        SlowFlexible gamePiece = new SlowFlexible (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);
    } else if (type.toLowerCase().equals(" fast")){
        FastPiece gamePiece = new FastPiece (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);
    }else {
        SlowPiece gamePiece = new SlowPiece (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);
    }
System.out.println(" ");
System.out.println("Enter a command (type help for details)");
}
    }
    in.close(); // close scanner
}
}
