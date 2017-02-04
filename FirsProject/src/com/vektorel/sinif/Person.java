package com.vektorel.sinif;

public class Person {

	long tc;
	String ad;
	String soyadi;
	int yas;
	String meslek;

	public Person(long tc, String ad, String soyadi) {
		this.tc = tc;
		this.ad = ad;
		this.soyadi = soyadi;
	}

	public Person(long tc, String ad, String soyadi, int yas) {
		this(tc, ad, soyadi); // sadece ilk satýrda çaðýrabilirsin
		this.yas = yas;

	}

	public Person(long tc, String ad, String soyadi, int yas, String meslek) {
		this(tc, ad, soyadi, yas); // sadece ilk satýrda çaðýrabilirsin

		this.meslek = meslek;
	}

	public void yaz(){
		System.out.println(tc +" "+ad+" "+soyadi+" "+yas+" "+meslek);
	}
}
