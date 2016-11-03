package com.sd.turtle;
import ch.aplu.turtle.*;

class drawPinWheel {
  
  public static void main (String [] args) {
  
  Turtle t1 = new Turtle();
  
  int num = 19;
  int length = 60;
  double degree = 120.0;
  double degrees = 150.0;

  t1.home();
  t1.clear();
  
  for (int i=1; i<num; i++) {
  
    if (i==1) {
      t1.forward(length);
      t1.right(degree);
    }
    else if (i%2==0) {
      t1.forward(length);
    }
    else if (i%3==0) {
      t1.right(degree);
      t1.forward(length);
      t1.left(degrees);
    }
    else {
      t1.right(degree);
      t1.forward(length);
      t1.right(degree);
    }
  
    }
  
  }


}