package Labs.Lab2;


// Rectangle 2
// Megan Picard
// B00939548


//Rectangle class that defines a Rectangle object with xpos, ypos, width and height
//Has two contains methods
public class Rectangle2 {
    private int xpos, ypos, width, height;
    //constructors
    public Rectangle2(){} public Rectangle2(int xpos, int ypos, int width, int height){ this.xpos=xpos; this.ypos=ypos; this.width=width; this.height=height;}
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
        public boolean contains(Rectangle2 r)
        {
        return(this.contains(r.getX(),r.getY())&& this.contains(r.getX() + r.getWidth(), r.getY()+r.getHeight())); }

        // TOUCHES
       //public boolean touch(int px, int py) {
            //return (px>=xpos && px<=xpos+width && py>=ypos && py<= ypos+height); }           
           
            public boolean touch(Rectangle2 r){

                // checks if left/right edge is at right/left edge
                if (this.xpos == r.xpos + r.width || this.xpos + this.width == r.xpos){
                    return true;

                // checks if top/bottom edge is at bottom/top edge
                }else if (this.ypos == r.ypos + r.height || this.ypos + this.height == r.ypos){
                    return true;

                // checking for exact corner touching

                // top left
                } else if (this.xpos == r.xpos && this.ypos == r.ypos){
                    return true;

                // top right
                } else if (this.xpos + this.width == r.xpos + r.width && this.ypos == r.ypos){
                    return true;
            
                // bootom left
                } else if (this.xpos + this.width == r.xpos + r.width && this.ypos + this.height == r.ypos + r.height){
                    return true;

                // bottom right
                } else if (this.xpos == r.xpos && this.ypos + this.height == r.ypos + r.height){
                    return true;

                }else { // all not true, returns false
                    return false;
                }
            
            }


        // OVERLAPS
        //public boolean overlaps(int px, int py) {
           // return ((px == xpos+width) && (py == xpos+width) || ) } 
            
            public boolean overlaps(Rectangle2 r){

               // checks for overlap AND that it doesnt contain the rectangle
               if (this.xpos < r.xpos + r.width && this.xpos + this.width > r.xpos &&
               this.ypos < r.ypos + r.height && this.ypos + this.height > r.ypos && !this.contains(r)){
               return true;

               } else { // if all above if not true
                return false;
               }


             }




}