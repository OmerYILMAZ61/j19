package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {

	public PlajVoleybol(){
		System.out.println("plajvoleybol s�n�f�");

	}
	
	public void takiminiSoyle(){
		
		
		setTak�m("pon�ik k�zlar");
		System.out.println("tak�m�: " + getTak�m());
		super.kacKisiyiz(30);
		
	}
}
