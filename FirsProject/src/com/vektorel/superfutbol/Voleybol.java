package com.vektorel.superfutbol;

public class Voleybol extends Spor {
	
	static String degisgen = "Voleybol";
	public Voleybol(){
		System.out.println("voleybol s�n�f� yap�land�r�c�");
	}

	public void kacKisiyiz(int value){
		super.kacKisiyiz(value);
		System.out.println("voleybol s�n�f�nda " + value + " k�z�z");
	}

	public static void neredeyiz(){
		System.out.println("berlindeyiz");
	}
	// final fonksiyonlar override olmaz!
//	public void hakemVar(){
//		
//	}

}
