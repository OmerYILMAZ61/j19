package com.vektörel.kurs;

public abstract class AKurs {

	abstract public void egitimVer();

	public double fiyatHesapla(Kisi kisi) {
		if (kisi.getMevki().equals("ogrenci")) {
			return 5000;
		} else {
			return 6000;
		}

	}

	public void ilkEgitimZamaný() {

		
	}

	public void hosgeldin(Kisi kisi) {
		if (kisi.isHoca()) {
			System.out.println("hoþgeldin hoca " + kisi.getAdi() + " " + kisi.getSoyAdi());
		} else {
			System.out.println("hoþgeldiniz " + kisi.getAdi() + " " + kisi.getSoyAdi());
		}

	}
}
