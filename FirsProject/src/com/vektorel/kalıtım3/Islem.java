package com.vektorel.kalıtım3;

import com.vektorel.kalitim.AraziAracı;

public class Islem {

	public static void main(String[] args) {

		Araba araba = new Araba();

		HizArabasi hizArabasi = new HizArabasi();
		hizArabasi.setAksesuar("rüzgarlık");
		hizArabasi.setMarkası("BMW");
		hizArabasi.setModel(2017);
		hizArabasi.setTurboMiktarı(5000);
		hizArabasi.setMotorGucu(2000.0);

		hizArabasi.hareketEt();
		hizArabasi.fren();
		hizArabasi.yaz();

		BinekArabasi binekAraba = new BinekArabasi();

		
		
		
		
		AraziAracı araziAracı = new AraziAracı();

		araziAracı.motorGucuDegistir();
		System.out.println(araziAracı.motorGucu);

	}

}
