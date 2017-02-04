package com.vektorel.kalýtým3;

import com.vektorel.kalitim.AraziAracý;

public class Islem {

	public static void main(String[] args) {

		Araba araba = new Araba();

		HizArabasi hizArabasi = new HizArabasi();
		hizArabasi.setAksesuar("rüzgarlýk");
		hizArabasi.setMarkasý("BMW");
		hizArabasi.setModel(2017);
		hizArabasi.setTurboMiktarý(5000);
		hizArabasi.setMotorGucu(2000.0);

		hizArabasi.hareketEt();
		hizArabasi.fren();
		hizArabasi.yaz();

		BinekArabasi binekAraba = new BinekArabasi();

		
		
		
		
		AraziAracý araziAracý = new AraziAracý();

		araziAracý.motorGucuDegistir();
		System.out.println(araziAracý.motorGucu);

	}

}
