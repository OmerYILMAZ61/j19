package com.vekt�rel.su;

public class Baraj extends ASu {

	@Override
	public int debi() {
		return 1000;
		
	}

	@Override
	public void oltaIleTutmak() {
		System.out.println("barajda bal�k tutmak �ok g�zel");
	}

	@Override
	public void tuzlulukOran�() {
		System.out.println(10 + " Tuz Oran�");
	}
}
