package com.vekt�rel.su;

public class Islem {

	public static void main(String[] args) {

		Golet golet = new Golet();

		golet.akar();
		// golet.debi();
		// golet.oltaIleTutmak();
	
//		IBalikTutmak bal�kTut = new Baraj();
//		bal�kTut.oltaIleTutmak();
		
		ASu abstractOrnegiG = new Golet();
		abstractOrnegiG.tuzlulukOran�();
		abstractOrnegiG.debi();
		abstractOrnegiG.oltaIleTutmak();
		
		
		ASu abstractOrnegiB = new Baraj();
		abstractOrnegiB.tuzlulukOran�();
		
		

	
	}
}
