package com.sd.aGameOfYut;

public class YutGame {

  public void hi() {
 
  int a;
  int b;
  int c;
  int d;
  int f;
  
  a= (int)(Math.random()*2);
  b= (int)(Math.random()*2);
  c= (int)(Math.random()*2);
  d= (int)(Math.random()*2);
  
  f = a+b+c+d;
  
  System.out.println("StartGame");

  System.out.println("Your Yut is" + a + b + c + d);
  
  if(f==0){                                        
   System.out.println("mo");
  }
  else if(f==1){
   System.out.println("do");                
  }
  else if(f==2){
   System.out.println("gae");              
  } 
  else if(f==3){
   System.out.println("gul");               
  }
  else if(f==4){
   System.out.println("yut");              
  }
   
  System.out.println("Next Player turn");
    
   }
 }