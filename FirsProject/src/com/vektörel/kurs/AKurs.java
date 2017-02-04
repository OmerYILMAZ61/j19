package com.vekt�rel.kurs;

public abstract class AKurs {

	abstract public void egitimVer();

	public double fiyatHesapla(Kisi kisi) {
		if (kisi.getMevki().equals("ogrenci")) {
			return 5000;
		} else {
			return 6000;
		}

	}

	public void ilkEgitimZaman�() {

		
	}

	public void hosgeldin(Kisi kisi) {
		if (kisi.isHoca()) {
			System.out.println("ho�geldin hoca " + kisi.getAdi() + " " + kisi.getSoyAdi());
		} else {
			System.out.println("ho�geldiniz " + kisi.getAdi() + " " + kisi.getSoyAdi());
		}

	}
}
