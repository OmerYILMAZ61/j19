package com.vektörel.su;

public class Baraj extends ASu {

	@Override
	public int debi() {
		return 1000;
		
	}

	@Override
	public void oltaIleTutmak() {
		System.out.println("barajda balýk tutmak çok güzel");
	}

	@Override
	public void tuzlulukOraný() {
		System.out.println(10 + " Tuz Oraný");
	}
}
