package A3;
import java.util.*;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;


public class PlayerRecord {
    
        private String date;
        private String desc;
        private double amount;
        
        public PlayerRecord(String date, String desc, double amount)
        {
        this.date = date;
        this.desc = desc;
        this.amount = amount;
        }
        public String toString(){
            return "hello";
        }
        public boolean equals(PlayerRecord other){
            return (desc.equals(other.getDesc())&&date.equals(other.getDate())&&amount==other.getAmount());
        }
        public String getDesc(){
            return desc;
        }

        public String getDate(){
            return date;
        }
        public double getAmount(){
            return amount;
        }


    }
        