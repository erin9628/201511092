package com.sd.dicegame;

public class DiceGame {
	Player p1 =  new Player("A");
	Player p2 =  new Player("B");
	public void startGame () {
		p1.play();
		p2.play();
		if ( p1.getNum() > p2.getNum() ) {
			System.out.println(p1.getName() + " is winner!");
		}
		else if ( p1.getNum() == p2.getNum() ) {
			System.out.println(" draw ");
		}
		else {
			System.out.println(p2.getName() + " is winner !");
		}
	
	}
}
