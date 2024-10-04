package Assignments.A1;

// Assignment 1 - Csci 2110
// Author: Megan Picard

public class Pieces{
    private String name;
    private String colour;
    private int positionX;
    private int positionY;
// consruct
public Pieces(String name, String colour, int positionX, int positionY){
    this.name = name;
    this.colour = colour;
    this.positionX = positionX;
    this.positionY = positionY;
    }
// getters
public String getName(){return name;}
public String getColour(){return colour;}
public int getPositionX(){return positionX;}
public int getPositionY(){return positionY;}
// setters
public void setName(String name){this.name = name;}
public void setColour(String colour){this.colour = colour;}
public void setPositionX(int positionX){this.positionX = positionX;}
public void setPositionY(int positionY){this.positionY = positionY;}
public String toString(){ // rteurns name and colour
    return  name + colour;
}

}