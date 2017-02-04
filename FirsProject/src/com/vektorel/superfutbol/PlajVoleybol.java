package com.vektorel.superfutbol;

public class PlajVoleybol extends Voleybol {

	public PlajVoleybol(){
		System.out.println("plajvoleybol sýnýfý");

	}
	
	public void takiminiSoyle(){
		
		
		setTakým("ponçik kýzlar");
		System.out.println("takýmý: " + getTakým());
		super.kacKisiyiz(30);
		
	}
}
