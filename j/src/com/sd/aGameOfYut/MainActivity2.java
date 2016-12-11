package com.sd.aGameOfYut;

import java.util.Scanner;

public class MainActivity2 {

 public static void main(String[] args) {
 
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
  
  System.out.println("윳놀이를 시작합니다 _ 0이나1을 던집니다");

  System.out.println("나온 것은" + a + b + c + d +"입니다.");
  
  if(f==0){                                        
   System.out.println("모");
  }
  else if(f==1){
   System.out.println("도");                
  }
  else if(f==2){
   System.out.println("개");              
  } 
  else if(f==3){
   System.out.println("걸");               
  }
  else if(f==4){
   System.out.println("윳");              
  }
   
  System.out.println("다음 타자로 넘어갑니다.");
    
   
 }
}