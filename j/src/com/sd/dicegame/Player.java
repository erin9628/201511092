package com.sd.dicegame;


public class Player {
	private String name = null;
	public int num = 0;  
	public Player(String p_name) {
		 name = p_name;
	}
	public void play() {
		Dice d = new Dice();
		d.roll();
		num = d.getNum();
	}
	public String getName() {
		return this.name;
	}
	public int getNum() { 
		return this.num;
	}
}
