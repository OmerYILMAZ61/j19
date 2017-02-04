package com.vektorel.superfutbol;

public class Voleybol extends Spor {
	
	static String degisgen = "Voleybol";
	public Voleybol(){
		System.out.println("voleybol sýnýfý yapýlandýrýcý");
	}

	public void kacKisiyiz(int value){
		super.kacKisiyiz(value);
		System.out.println("voleybol sýnýfýnda " + value + " kýzýz");
	}

	public static void neredeyiz(){
		System.out.println("berlindeyiz");
	}
	// final fonksiyonlar override olmaz!
//	public void hakemVar(){
//		
//	}

}
