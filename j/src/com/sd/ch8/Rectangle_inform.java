package com.sd.ch8;
public class Rectangle {
	protected double length;
	double width;
	public Rectangle(double l, double w) {
		this.length=l;
		this.width=w;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidte() {
		return this.width;
	}
}

/classpath ./classes
com.sd.ch8.Rectangle r=new com.sd.ch8.Rectangle(10.0,20.0);
class는 하드디스크에 있다. r은 메모리에 있다가 하드디스크에 있는 것을 불러온다.

근데 귀찮으니까 (import명령어는 메인..뭐시기를 간단하게 해준다.)
import com.sd.ch8.Rectangle;
Rectangle r=new Rectangle(20.0,30.0);