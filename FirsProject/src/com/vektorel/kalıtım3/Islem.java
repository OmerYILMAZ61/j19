package com.vektorel.kal�t�m3;

import com.vektorel.kalitim.AraziArac�;

public class Islem {

	public static void main(String[] args) {

		Araba araba = new Araba();

		HizArabasi hizArabasi = new HizArabasi();
		hizArabasi.setAksesuar("r�zgarl�k");
		hizArabasi.setMarkas�("BMW");
		hizArabasi.setModel(2017);
		hizArabasi.setTurboMiktar�(5000);
		hizArabasi.setMotorGucu(2000.0);

		hizArabasi.hareketEt();
		hizArabasi.fren();
		hizArabasi.yaz();

		BinekArabasi binekAraba = new BinekArabasi();

		
		
		
		
		AraziArac� araziArac� = new AraziArac�();

		araziArac�.motorGucuDegistir();
		System.out.println(araziArac�.motorGucu);

	}

}
