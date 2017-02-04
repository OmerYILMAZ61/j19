package com.vektörel.donerci;

public class Islem {

	public static void main(String[] args) {
		MutluDoner mutluDoner = new MutluDoner();
		mutluDoner.donerKesme();
		mutluDoner.paketleme();
		double sonuc = mutluDoner.fiyatHesapla(100, 20);
		System.out.println("fiyat " + sonuc);
	}
}
