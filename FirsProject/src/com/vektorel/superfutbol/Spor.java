package com.vektorel.superfutbol;

public class Spor {

	private String takým;
	private String topRengi = "beyaz";

	final double PI=2.0;
	// yapýlandýrýcýlar
	public Spor() {
		System.out.println("Spor Sýnýfýndayým");
	}

	public Spor(String value) {
		System.out.println("Spor Sýnýfý Deðer: " + value);
	}

	public void topRengiSoyle(String value) {
		System.out.println(value);
		System.out.println("sen ne istersen olur aðabey");
		
	}
	// fonksiyonlar
	public void takýmSoyle() {
		System.out.println("takým: " + this.takým);
	}

	public void topunSekliniSoyle() {
		System.out.println("Top Þekli Kare");
	}

	public void topRengiSoyle() {
		System.out.println("takým: " + this.topRengi);
	}

	public void kacKisiyiz(int value){
		System.out.println("toplam " +value + " kiþiyiz");
	}
	
	// final kullanýmýndan sonra baþka yerde override yazýlmaz!
	final public void hakemVar(){
		System.out.println("Spor - Hakem");
	}
	
	final public void hangiSahadasin(final String sahaIsmi){
		// sahaIsmi = "olimpiyat" : final tanýmlandýðý için yeniden setleme yapýlmaz !
		System.out.println("sahanýn ismi " + sahaIsmi);
		
	}
    public void hangiSahadasin(final String sahaIsmi,String ikinci){
		// sahaIsmi = "olimpiyat" : final tanýmlandýðý için yeniden setleme yapýlmaz !
		System.out.println("sahanýn ismi " + sahaIsmi);
		
	}
	
    public void hangiSahadasin(final double sahaIsmi){
		// sahaIsmi = "olimpiyat" : final tanýmlandýðý için yeniden setleme yapýlmaz !
		System.out.println("sahanýn ismi " + sahaIsmi);
		
	}
	
	// setget
	public String getTakým() {
		return takým;
	}

	public void setTakým(String takým) {
		this.takým = takým;
	}

	public String getTopRengi() {
		return topRengi;
	}

	public void setTopRengi(String topRengi) {
		this.topRengi = topRengi;
	}

	

}
