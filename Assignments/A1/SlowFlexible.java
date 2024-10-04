package Assignments.A1;
// Assignment 1 - Csci 2110
// Author: Megan Picard
//


public class SlowFlexible  extends SlowPiece{
    public SlowFlexible(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class

    }

 // Slow Piece moves ONE SPACE right or left/ up or down
 public boolean move(String direction){
       
    
        if (getPositionX() + 1 >= 8 || getPositionY() + 1 >= 8 || getPositionX() - 1 < 0  || getPositionY() - 1 < 0){
            return false;
        } else {
            return true;
        }
    
 }

    public String toString() { // adds F so now its SF
        return super.toString() + "F"; 
         }
}