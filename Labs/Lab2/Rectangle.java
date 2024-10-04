package Labs.Lab2;


// Rectangle 1
// Megan Picard
// B00939548


//Rectangle class that defines a Rectangle object with xpos, ypos, width and height
//Has two contains methods
public class Rectangle{ 
    private int xpos, ypos, width, height;
    //constructors
    public Rectangle(){} public Rectangle(int xpos, int ypos, int width, int height){ this.xpos=xpos; this.ypos=ypos; this.width=width; this.height=height;}
    //setters and getters 
    public void setX(int xpos){this.xpos=xpos;}
    public void setY(int ypos){this.ypos=ypos;} public void setWidth(int width){this.width=width;} public void setHeight(int height){this.height=height;}
    public int getX(){return xpos;} public int getY(){return ypos;} public int getWidth(){return width;}
    public int getHeight(){return height;}
   
    //other methods: moveTo changes xpos and ypos and resize changes
    //width and height
    public void moveTo(int xpos, int ypos){this.xpos=xpos; this.ypos=ypos;} public void resize(int width, int height){this.width=width; this.height=height;}
    // toString method that returns the rectangle's details in the format //(xpos, ypos, width, height)
    public String toString() { return "(" + xpos + ", " + ypos + ", " + width + ", " + height + ")";
    }
   
    //contains method: returns true if a point (px, py) is contained within this rectangle
    //contains also returns true if the point touches the rectangle
    public boolean contains(int px, int py) {
        return (px>=xpos && px<=xpos+width && py>=ypos && py<= ypos+height); } //contains method: returns true if another rectangle r is contained within this rectangle
        //returns true if the rectangle touches the boundaries
        //it uses the point contains method 
        public boolean contains(Rectangle r)
        {
        return(this.contains(r.getX(),r.getY())&& this.contains(r.getX() + r.getWidth(), r.getY()+r.getHeight())); }
}