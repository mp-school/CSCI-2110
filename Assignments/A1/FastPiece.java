package Assignments.A1;

//package A1;
// Assignment 1 - Csci 2110
// Author: Megan Picard
//
public class FastPiece extends Pieces {
    
    private String distance;
        public FastPiece(String name, String colour, int positionX, int positionY){
            super(name, colour, positionX, positionY); // from Pieces class
        }
       
       // fast moves N SPACE right or left
       public boolean move(String distance, int n){
       
             
            if (getPositionX() + n >= 8 || getPositionY() + n >= 8 || getPositionX() - n < 0  || getPositionY() - n < 0){
                return false;
            } else {
                return true;
            }
              
       }
        @Override // shows f for fast on printed board
            public String toString(){
        return  super.toString() + "F";
    }
        
    }