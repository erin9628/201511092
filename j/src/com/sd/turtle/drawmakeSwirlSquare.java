package com.sd.turtle;
import ch.aplu.turtle.*;

class drawmakeSwirlSquare {
  public static void main(String [] args) {
  
  Turtle t1 = new Turtle();
  
  int turns = 20;
  int size = 5;
  int bigger = 15;
  double degree = 90.0;
  t1.home();
  t1.clear();
  for (int i=0;i<turns;i++) {
    if (i%2!=0) {
      size += bigger;
      }
    t1.forward(size);
    t1.right(degree);
    }
  }
 }
  