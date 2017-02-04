package com.vektorel.setget;

public class Login {

	public void kontrolEt(String kullanici, String sifre) {

		Veritabani veritabani = new Veritabani();
		System.out.println(veritabani.getUserName());
		System.out.println(veritabani.getPassword());
		veritabani.setUserName("ömer");
		veritabani.setPassword("***");
		System.out.println(veritabani.getUserName());
		System.out.println(veritabani.getPassword());

		if (veritabani.getUserName() == null || veritabani.getPassword() == null) {
			System.out.println("degerler null");
			return;
		}

		if (veritabani.getUserName().equals(kullanici) && veritabani.getPassword().equals(sifre)) {
			System.out.println("Giriþ Baþarýlý");
		} else {
				System.out.println("basarýsýz giriþ");
		}

	}
}
