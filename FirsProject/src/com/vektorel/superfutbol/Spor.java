package com.vektorel.superfutbol;

public class Spor {

	private String tak�m;
	private String topRengi = "beyaz";

	final double PI=2.0;
	// yap�land�r�c�lar
	public Spor() {
		System.out.println("Spor S�n�f�nday�m");
	}

	public Spor(String value) {
		System.out.println("Spor S�n�f� De�er: " + value);
	}

	public void topRengiSoyle(String value) {
		System.out.println(value);
		System.out.println("sen ne istersen olur a�abey");
		
	}
	// fonksiyonlar
	public void tak�mSoyle() {
		System.out.println("tak�m: " + this.tak�m);
	}

	public void topunSekliniSoyle() {
		System.out.println("Top �ekli Kare");
	}

	public void topRengiSoyle() {
		System.out.println("tak�m: " + this.topRengi);
	}

	public void kacKisiyiz(int value){
		System.out.println("toplam " +value + " ki�iyiz");
	}
	
	// final kullan�m�ndan sonra ba�ka yerde override yaz�lmaz!
	final public void hakemVar(){
		System.out.println("Spor - Hakem");
	}
	
	final public void hangiSahadasin(final String sahaIsmi){
		// sahaIsmi = "olimpiyat" : final tan�mland��� i�in yeniden setleme yap�lmaz !
		System.out.println("sahan�n ismi " + sahaIsmi);
		
	}
    public void hangiSahadasin(final String sahaIsmi,String ikinci){
		// sahaIsmi = "olimpiyat" : final tan�mland��� i�in yeniden setleme yap�lmaz !
		System.out.println("sahan�n ismi " + sahaIsmi);
		
	}
	
    public void hangiSahadasin(final double sahaIsmi){
		// sahaIsmi = "olimpiyat" : final tan�mland��� i�in yeniden setleme yap�lmaz !
		System.out.println("sahan�n ismi " + sahaIsmi);
		
	}
	
	// setget
	public String getTak�m() {
		return tak�m;
	}

	public void setTak�m(String tak�m) {
		this.tak�m = tak�m;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}

	

}
