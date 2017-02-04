package com.vektorel.sinif;

public class Ucgen {
	private int tabanUzunlugu;
	private int ikizKenarUz;
	private int yukseklik;

	public Ucgen(int tabanUzunlugu, int ikizKenarUz, int yukseklik) {
		this.tabanUzunlugu = tabanUzunlugu;
		this.ikizKenarUz = ikizKenarUz;
		this.yukseklik = yukseklik;
		
		
	}

	public int alanHesapla() {

		return (tabanUzunlugu * yukseklik) / 2;

	}

	public int cevreHesapla() {

		return ikizKenarUz * 2 + tabanUzunlugu;

	}

}
