import ch.aplu.turtle.*;

class Draw{
  Turtle t1=new Turtle();
  
  int size;
  int sides;
  double angle;
  
  Draw(int size,int sides,double angle){
    this.size=size;
    this.sides=sides;
    this.angle=angle;
  }
  public void drawTriangle(){
    for(int i=0;i<sides;i++){
      t1.fd(size);
      t1.right(angle);
    }
  }
  public void drawSquare(){
    for(int i=0;i<sides;i++){
      t1.fd(size);
      t1.right(angle);
    }
  }
}
public class EnumShape {
    EnumShape (int size,int sides,double angle) {
      Draw d = new Draw(size,sides,angle);
      switch (sides) {
        case 3:
           
            d.drawTriangle();
            break;
        case 4:
           
            d.drawSquare();
            break;
      }
    } 
    

    /*enum Shape {TRIANGLE, SQUARE}
    Shape sel=Shape.TRIANGLE;
    int size=100;
    int sides;
    double angle;
    switch (sel) {
        case TRIANGLE:
            sides=3;
            angle=120;
            break;
        case SQUARE:
            sides=4;
            angle=90;
            break;*/


   public static void main ( String [] args) {
   
    EnumShape e = new EnumShape(1000, 3, 120.0);
    
    
   }
   
}
