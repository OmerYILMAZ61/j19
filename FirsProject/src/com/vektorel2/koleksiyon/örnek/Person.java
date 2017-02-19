package com.vektorel2.koleksiyon.örnek;

public class Person {

	int tc;
	String isim;
	String soyad;
	String dogumYeri;
	
	public Person(int tc, String isim, String soyad, String dogumYeri) {
		this.tc = tc;
		this.isim = isim;
		this.soyad = soyad;
		this.dogumYeri = dogumYeri;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	
	public void veriYaz(){
		System.out.println(tc + " " + isim + " " +soyad + " " + dogumYeri + " ");
	}
	
	
}
