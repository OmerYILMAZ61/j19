package com.vekt�rel.poly;

public class Islem {

	public static void main(String[] args) {
		Sekil sekil = new Sekil();
	//	System.out.println("" + sekil.alanHesaplama());
	
		
		Sekil daire = new Daire();
	//	System.out.println("daire alan� " +daire.alanHesaplama());
		
		Sekil kare = new Kare();
	//	System.out.println("kare alan� " + kare.alanHesaplama());
		
		Sekil ucgen = new Ucgen();
	//	System.out.println("ucgen alan� " + ucgen.alanHesaplama());
		
		
		alanDegerleriniVer(sekil);
		alanDegerleriniVer(daire);
		alanDegerleriniVer(kare);
		alanDegerleriniVer(ucgen);
		
		
			
	}

	private static void alanDegerleriniVer(Sekil sekil) {
		System.out.println(sekil.alanHesaplama());
		
	}

}
