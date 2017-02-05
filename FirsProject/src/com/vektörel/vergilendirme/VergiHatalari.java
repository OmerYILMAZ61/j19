package com.vektörel.vergilendirme;

public class VergiHatalari extends Exception {

	String deger;

	public void yanlisKisi() {
		System.out.println("yanlýþ kiþi girdiniz!!");
	}

	public void hataliDeger() {
		System.out.println("hatalý deðer girdiniz!!");
	}

	public VergiHatalari(String deger) {

		this.deger = deger;
	}

	public void myMassage() {
		if (deger.equals("isim hatalý") )
			yanlisKisi();
		if (deger.equals("kar hatalý"))
			hataliDeger();

	}
}
