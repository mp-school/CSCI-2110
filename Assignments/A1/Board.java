package Assignments.A1;

public class Board {
     // instance vars
     private Pieces[][] board;
     public Board() { // consturctor
     board = new Pieces[8][8];
     }
     // adds a piece if the space is null
     public boolean addPiece(Pieces piece, int row, int col){
         if (board[row][col] == null){
             board[row][col] = piece;
             return true;
         } 
             System.out.println("Error: piece already at (" + row + " " + col + ")");
             return false;
         
     }
     // moving a piece n spaces based on fast/flex combo
     public boolean movePiece(int row, int col, String direction, int spacesMoved){
         Pieces moveThePiece = board[row][col];
         int newRowValue = row;
         int newColValue = col;
     
         // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         if (board[row][col] == null){
             System.out.println("Error: no piece at (" + row + " " + col + ") ");
             return false;
         } else { 
             // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - // SLOW
               if (moveThePiece instanceof SlowPiece){ 
                if (((SlowPiece) moveThePiece).move(direction) == true){
                     switch (direction){
                         case "left":
                         newColValue = col - 1;
                     board[newRowValue][newColValue] = moveThePiece;
                     moveThePiece.setPositionX(newRowValue);
                     moveThePiece.setPositionY(newColValue);
                     System.out.println("Piece at " + "(" + row + "," + col + ") " +
                     "moved left 1 space" );
                     break;
                     case "right" :
                     newColValue = col + 1;
                     board[newRowValue][newColValue] = moveThePiece;
                     moveThePiece.setPositionX(newRowValue);
                     moveThePiece.setPositionY(newColValue);
                     System.out.println("Piece at " + "(" + row + "," + col + ") " +
                     "moved right 1 space" );
                     break;
                     
                     }
                     
                } if (newRowValue < 0 || newRowValue >= 8 || newColValue < 0 || newColValue >= 8) {
                 System.out.println("Out of Bounds!!");
                }
                 
                     
                 board[row][col] = null; // Clear old position
                
             // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - // FAST
                 
             } if (moveThePiece instanceof FastPiece){ 
                if (((FastPiece) moveThePiece).move(direction, spacesMoved) == true){
                 switch (direction){
                     case "left":
                     newColValue = col - spacesMoved;
                 board[newRowValue][newColValue] = moveThePiece;
                 moveThePiece.setPositionX(newRowValue);
                 moveThePiece.setPositionY(newColValue);
                 System.out.println("Piece at " + "(" + row + "," + col + ") " +
                 "moved left 1 space" );
                 break;
                 case "right" :
                 newColValue = col + spacesMoved;
                 board[newRowValue][newColValue] = moveThePiece;
                 moveThePiece.setPositionX(newRowValue);
                 moveThePiece.setPositionY(newColValue);
                 System.out.println("Piece at " + "(" + row + "," + col + ") " +
                 "moved right 1 space" );
                 break;
                 
             } 
                     
                 }if (newRowValue < 0 || newRowValue >= 8 || newColValue < 0 || newColValue >= 8){
                     System.out.println("Out of Bounds!!");
                 board[row][col] = null; // Clear old position
                 
             
             // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - // SLOW FLEX
                 
         } if (moveThePiece instanceof SlowFlexible){ 
             if (((SlowFlexible) moveThePiece).move(direction) == true){
              switch (direction){
                 case "left":
                 newColValue = col - 1;
                 board[newRowValue][newColValue] = moveThePiece;
                 System.out.println("Piece at " + "(" + row + "," + col + ") " +
                 "moved left 1 space" );
                 moveThePiece.setPositionX(newRowValue);
                 moveThePiece.setPositionY(newColValue);
             
              break;
              case "right" :
             newColValue = col + 1;
             board[newRowValue][newColValue] = moveThePiece;
             System.out.println("Piece at " + "(" + row + "," + col + ") " +
             "moved right 1 space" );
              moveThePiece.setPositionX(newRowValue);
              moveThePiece.setPositionY(newColValue);
             
              break;
              
          case "up" :
          newRowValue = row - 1;
                     board[row][newColValue] = moveThePiece;
                     System.out.println("Piece at " + "(" + row + "," +col + ") " +
                     "moved up 1 space" );
                     moveThePiece.setPositionX(newRowValue);
                     moveThePiece.setPositionY(newColValue);
             break;
             case "down" :
             newRowValue = row + 1;
                        board[row][newColValue] = moveThePiece;
                        System.out.println("Piece at " + "(" + row + "," +col + ") " +
                        "moved down 1 space" );
                        moveThePiece.setPositionX(newRowValue);
                        moveThePiece.setPositionY(newColValue);
                break;
    
         }
                  
              if (newRowValue < 0 || newRowValue >= 8 || newColValue < 0 || newColValue >= 8){
                  System.out.println("Out of Bounds!!");
              board[row][col] = null; // Clear old position
              }
         }
             // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - // FAST FLEX
                 
         } if (moveThePiece instanceof FastFlexible){ 
             if (((FastFlexible) moveThePiece).move(direction, spacesMoved) == true){
              switch (direction){
                 case "left":
                 newColValue = col - spacesMoved;
                 board[newRowValue][newColValue] = moveThePiece;
                 System.out.println("Piece at " + "(" + row + "," + col + ") " +
                 "moved left "+  spacesMoved + " space(s)" );
                 moveThePiece.setPositionX(newRowValue);
                 moveThePiece.setPositionY(newColValue);
             
              break;
              case "right" :
             newColValue = col + spacesMoved;
             board[newRowValue][newColValue] = moveThePiece;
             System.out.println("Piece at " + "(" + row + "," + col + ") " +
             "moved right "+  spacesMoved + " space(s)" );
              moveThePiece.setPositionX(newRowValue);
              moveThePiece.setPositionY(newColValue);
             
              break;
              
          case "up" :
          newRowValue = row - spacesMoved;
                     board[row][newColValue] = moveThePiece;
                     System.out.println("Piece at " + "(" + row + "," +col + ") " +
                     "moved up " +  spacesMoved + " space(s)" );
                     moveThePiece.setPositionX(newRowValue);
                     moveThePiece.setPositionY(newColValue);
             break;
             case "down" :
             newRowValue = row + spacesMoved;
                        board[row][newColValue] = moveThePiece;
                        System.out.println("Piece at " + "(" + row + "," +col + ") " +
                        "moved down "+  spacesMoved + " space(s)" );
                        moveThePiece.setPositionX(newRowValue);
                        moveThePiece.setPositionY(newColValue);
                break;
    
         }
                  
              }if (newRowValue < 0 || newRowValue >= 8 || newColValue < 0 || newColValue >= 8){
                  System.out.println("Out of Bounds!!");
              board[row][col] = null; // Clear old position
              }
         }
     }
                 
                 board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
                 board[row][col] = null; // Clear old position
                 
                 moveThePiece.setPositionX(newColValue); // Update piece's X position
                 moveThePiece.setPositionY(newRowValue); // Update piece's Y position
                 
                return true;
             }
             
         }
     // prints out board
     public void printOutBoard(){ 
         for (int i = 0; i < 8; i++){
             for (int j = 0; j < 8; j++){
                 if (board[i][j] != null){
                     System.out.print(board[i][j].toString() + " ");
                 } else {
                     System.out.print("       --       ");
                 }
             }
             System.out.println();
         }
     
 }
 public Pieces getBoard(int row, int col){
     return board[row][col];
 }
}
