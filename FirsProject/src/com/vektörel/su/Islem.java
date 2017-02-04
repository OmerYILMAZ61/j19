package com.vektörel.su;

public class Islem {

	public static void main(String[] args) {

		Golet golet = new Golet();

		golet.akar();
		// golet.debi();
		// golet.oltaIleTutmak();
	
//		IBalikTutmak balýkTut = new Baraj();
//		balýkTut.oltaIleTutmak();
		
		ASu abstractOrnegiG = new Golet();
		abstractOrnegiG.tuzlulukOraný();
		abstractOrnegiG.debi();
		abstractOrnegiG.oltaIleTutmak();
		
		
		ASu abstractOrnegiB = new Baraj();
		abstractOrnegiB.tuzlulukOraný();
		
		

	
	}
}
