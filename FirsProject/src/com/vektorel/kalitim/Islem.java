package com.vektorel.kalitim;

public class Islem {

	public static void main(String[] args) {

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		Dede dede = new Dede();
		dede.konusma();
		dede.yurume();
		dede.gozRengi();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Baba baba = new Baba();
		//babadan gelir
		baba.okumaYazma();
		// dededen gelir
		baba.konusma();
		baba.yurume();

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Amca amca = new Amca();
		//dededen gelir
		amca.konusma();
		amca.yurume();
		//amcadan gelir
		amca.gozRengi();
		amca.pilot();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Cocuk cocuk = new Cocuk();
		// babadan gelir
		cocuk.okumaYazma();
		// dededen gelir
		cocuk.konusma();
		cocuk.yurume();
		//kendi özelliði
		cocuk.universite();
		cocuk.yurume();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Amca amca2 = new Amca();
		amca2.gozRengi();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	
	
	}
}
