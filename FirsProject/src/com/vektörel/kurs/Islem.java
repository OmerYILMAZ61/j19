package com.vektörel.kurs;

public class Islem {
	public static void main(String[] args) {

		Kisi ogrenci = new Kisi();
		Kisi normal = new Kisi();
		Kisi hoca = new Kisi();

		ogrenci.setAdi("omer");
		ogrenci.setSoyAdi("yýlmaz");
		ogrenci.setMevki("ogrenci");

		normal.setAdi("asd");
		normal.setSoyAdi("das");
		normal.setMevki("normal");

		hoca.setAdi("mustafa");
		hoca.setSoyAdi("ergan");
		hoca.setMevki("hoca");
		hoca.setHoca(true);

		OyaSurucuKursu oyaKurs = new OyaSurucuKursu();
		// BaskentSurucuKursu baskentKurs = new BaskentSurucuKursu();

		oyaKurs.hosgeldin(hoca);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		oyaKurs.hosgeldin(ogrenci);
		System.out.println("borcunuz " + oyaKurs.fiyatHesapla(ogrenci));
		oyaKurs.egitimVer();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

		oyaKurs.hosgeldin(normal);
		System.out.println("borcunuz " + oyaKurs.fiyatHesapla(normal));
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	}
}
