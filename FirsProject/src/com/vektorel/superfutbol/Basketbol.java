package com.vektorel.superfutbol;

public class Basketbol extends Spor {

	public Basketbol() {
		super("Basketbol");
		System.out.println("Basketbol S�n�f�nday�m");
	}
	
	@Override
	public void topRengiSoyle() {
		
		
		setTopRengi("kahverengi");
		System.out.println("top rengim: " + getTopRengi());
		super.topRengiSoyle();
		super.topRengiSoyle("Baba Burda");
	}
}

