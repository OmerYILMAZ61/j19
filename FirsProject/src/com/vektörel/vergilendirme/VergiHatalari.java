package com.vekt�rel.vergilendirme;

public class VergiHatalari extends Exception {

	String deger;

	public void yanlisKisi() {
		System.out.println("yanl�� ki�i girdiniz!!");
	}

	public void hataliDeger() {
		System.out.println("hatal� de�er girdiniz!!");
	}

	public VergiHatalari(String deger) {

		this.deger = deger;
	}

	public void myMassage() {
		if (deger.equals("isim hatal�") )
			yanlisKisi();
		if (deger.equals("kar hatal�"))
			hataliDeger();

	}
}
