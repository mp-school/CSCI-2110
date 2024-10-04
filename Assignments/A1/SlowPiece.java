package Assignments.A1;

public class SlowPiece extends Pieces{

    // instance vars
    private String direction;

    public SlowPiece(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class
    }

    // Slow Piece moves ONE SPACE right or left
        public boolean move(String direction){
         
            if (getPositionX() + 1 >= 8 || getPositionY() + 1 >= 8 || getPositionX() - 1 < 0  || getPositionY() - 1 < 0){
                return false;
            } else {
                return true;
            }
              
           
    }

        @Override
        public String toString(){
            return  super.toString() + "S";
        }
        
    }