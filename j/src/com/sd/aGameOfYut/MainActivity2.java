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
  
  System.out.println("�����̸� �����մϴ� _ 0�̳�1�� �����ϴ�");

  System.out.println("���� ����" + a + b + c + d +"�Դϴ�.");
  
  if(f==0){                                        
   System.out.println("��");
  }
  else if(f==1){
   System.out.println("��");                
  }
  else if(f==2){
   System.out.println("��");              
  } 
  else if(f==3){
   System.out.println("��");               
  }
  else if(f==4){
   System.out.println("��");              
  }
   
  System.out.println("���� Ÿ�ڷ� �Ѿ�ϴ�.");
    
   
 }
}