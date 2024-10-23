// Full Name: [Megan Picard]
// ID Number: [B00939548]
//package Assignments.A3; // comment out handing in
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class NHLStats {
    private List<PlayerRecord> players;
    public NHLStats() {
        players = new List<>(); // Use the provided List class
    }

    public void addPlayer(PlayerRecord player) {
        players.add(player);
    }

    public PlayerRecord mostPoints(PlayerRecord item){ // goals + assits
       return item;
    }


    public PlayerRecord mostAgressive(PlayerRecord item){ // most penalty minutes
        
        return item;
    }

    public PlayerRecord MVP(PlayerRecord item){ // most game winning goals
        return item;
    }


    public PlayerRecord mostPromising(PlayerRecord item){ // most shots on net
        return item;
    }

    public PlayerRecord teamMostAggressive(PlayerRecord item){ // most penatly minutes as a TEAM
        return item;
    }

   public PlayerRecord teamMVP(PlayerRecord item){ // most game winning goals as a TEAM
        return item;
    }


}




