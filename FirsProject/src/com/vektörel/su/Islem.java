package com.vektörel.su;

public class Islem {

	public static void main(String[] args) {

		Golet golet = new Golet();

		golet.akar();
		// golet.debi();
		// golet.oltaIleTutmak();
	
//		IBalikTutmak balıkTut = new Baraj();
//		balıkTut.oltaIleTutmak();
		
		ASu abstractOrnegiG = new Golet();
		abstractOrnegiG.tuzlulukOranı();
		abstractOrnegiG.debi();
		abstractOrnegiG.oltaIleTutmak();
		
		
		ASu abstractOrnegiB = new Baraj();
		abstractOrnegiB.tuzlulukOranı();
		
		

	
	}
}
