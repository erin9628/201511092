package com.sd.hello;

public class HelloWorld2 {
  public void hello() {
    System.out.println("Hello World from hello()");
  }
  public void hello(String name) {
    System.out.printf("Hello World %s!", name);
    //오버로딩
  }
  public static void main(String [] args) {
    System.out.println("Hello World");
  } 
}

