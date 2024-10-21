package Assignments.A3;
import java.util.*;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;

public class PlayerRecord { // instance vars
    String playerName;
    String postion;
    String teamName;
    int gamesPlayed;
    int goalsScored;
    int assists;
    int penaltyMinutes;
    int gamesStarted;
    int shotsOnGoal;
    int gameWinningGoals;

    // constuctor
    public PlayerRecord(String playerName, String postion,  String teamName, int gamesPlayed, 
    int goalsScored, int assists, int penaltyMinutes, int gamesStarted, int shotsOnGoal, int gameWinningGoals){


        this.playerName = playerName;
        this.postion = postion;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltyMinutes = penaltyMinutes;
        this.gamesStarted = gamesStarted;
        this.gameWinningGoals = gameWinningGoals;


        }


        //Getters
        public String getPlayerName(){return playerName;}
        public String getpostion(){return postion;}
        public String getteamName(){return teamName;}
        public int getgamesPlayed(){return gamesPlayed;}
        public int getgoalsScored(){return goalsScored;}
        public int getassists(){return assists;}
        public int getpenaltyMinutes(){return penaltyMinutes;}
        public int getgamesStarted(){return gamesStarted;}
        public int getshotsOnGoal(){return shotsOnGoal;}
        public int getgameWinningGoals(){return gameWinningGoals;}


        //Setters
        public void setPlayerName(String playerName){this.playerName = playerName;}
        public void setpostion(String postion){this.postion = postion;}
        public void setteamName(String teamName){this.teamName = teamName;}
        public void setgamesPlayed(int gamesPlayed){this.gamesPlayed = gamesPlayed;}
        public void setgoalsScored(int goalsScored){this.goalsScored = goalsScored;}
        public void setassists(int assists){this.assists = assists;}
        public void setpenaltyMinutes(int penaltyMinutes){this.penaltyMinutes = penaltyMinutes;}
        public void setgamesStarted(int gamesStarted){this.gamesStarted = gamesStarted;}
        public void setshotsOnGoal(int shotsOnGoal){this.shotsOnGoal = shotsOnGoal;}
        public void setgameWinningGoals(int gameWinningGoals){this.gameWinningGoals = gameWinningGoals;}


    }
        