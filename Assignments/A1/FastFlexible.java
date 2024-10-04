package Assignments.A1;
public class FastFlexible extends FastPiece {
    
    private String distance;

    public FastFlexible(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class
    }

     // Fast flex moves N SPACE right or left/ up or down
   public boolean move(String distance, int n){
       
  
    if (getPositionX() + n >= 8 || getPositionY() + n >= 8 || getPositionX() - n < 0  || getPositionY() - n < 0){
        return false;
    } else {
        return true;
    }
      





}



    public String toString() {  // adds F so now its FF
        return super.toString() + "F";
         }




    }