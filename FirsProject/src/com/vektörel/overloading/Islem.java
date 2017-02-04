package com.vektörel.overloading;

public class Islem {

	public static void main(String[] args) {

		Araba araba = new Araba();
		Araba arabaIntId = new Araba(101);// int
		Araba arabaDoubleId = new Araba(101.0);// double
		Araba arabaStringId = new Araba("101");// string
		Araba arabaIkiParametreliInt = new Araba(100, "fiat");
		Araba arabaIkiParametreliString = new Araba("100", "fiat");

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		// fiat
		Fiat fiat = new Fiat();
		fiat.setId(100);
		fiat.setName("elegans");
		Araba arabaFiat = new Araba(fiat);

		// volvo
		Volvo volvo = new Volvo(100);
		Araba arabaVolvo = new Araba(volvo);

		// toyota
		Toyota toyota = new Toyota();
		Araba arabaToyota = new Araba(toyota);
		Araba arabaToyota2 = new Araba(new Toyota(100, "corolla"));
	
		Araba arabaIkili = new Araba(fiat,new Volvo(100,"s60",2016));
		Araba arabaIkiliIki = new Araba(new Fiat(100,"rito"),new Volvo(100,"s60",2016));
		
		
		
	
	}
}
