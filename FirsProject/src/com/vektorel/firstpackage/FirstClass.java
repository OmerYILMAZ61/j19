package com.vektorel.firstpackage;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("�mer YILMAZ");

		String ad� = "�mer";
		String soyad� = "Y�lmaz";
		byte yas = 23;
		char cinsiyet = 'e';
		String sirketi = "vekt�rel";
		String poz = "calisan";
		float maa� = 1000;
		boolean evliMi = false;

		int sayi1 = 55;
		int sayi2 = 30;
		int sonuc = sayi1 % sayi2;
		System.out.println(sonuc);

		int rakam1 = 5;
		rakam1 %= 10;
		System.out.println(rakam1);

		byte x = 8;
		byte y = 7;
		int z = x | y; // bit d�zeyinde kar��la�t�rma //
		System.out.println(z);

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		int maasim = 1500;
		System.out.println(maasim == 1500);

		if (maasim > 2500) {
			System.out.println("maa��n y�ksek.");
		} else if (maasim < 750) {
			System.out.println("maasi�n d���k.");

		} else if (maasim > 1250 && maasim < 1500) {
			System.out.println("maa��n s�n�rda.");
		} else {
			System.out.println("maa��n ideal.");
		}

		String a = (maasim > 2500) ? "maas" : "poor";
		System.out.println(a);

		System.out.println("-----------");
		int i;
		for (i = 0; i < 10; i++) {
			if (i == 5) {

				System.out.println("5.yi atl�yorum");
				// continue; devam
				break; // ��k
			}
			System.out.println("merhaba");
		}
		System.out.println(i);
		int sayac = 5;
		while (sayac < 25) {
			System.out.println("saya� say�yor." + sayac);
			sayac++;
		}
		do {

			System.out.println(" do-while �al���yor");
		} while (false);

		System.out.println("*-*-*-*-*-");
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int k = 5;
		int l = 0;
		while (k >= 0) {

			while (l < k) {

				System.out.print("*");
				l++;
			}
			l = 0;
			System.out.println();
			k--;
		}
		int sayac2 = 3;
		for (int j = 0; j < sayac2 * 2; j++) {

			for (int p = 0; p <= j % sayac2; p++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// Integer sarmal= new Integer(null);
		// Integer sarmal = 5;
		// Integer sarmal2= sarmal;

		Integer name = 2;
		Integer name2 = name;
		name2 = 5;

		System.out.println(name);
		System.out.println(name2);

		for (int r = 0; r <= 4; r++) {
			for (int t = 0; t <= r; t++) {
				if (t == 0 || t == 2 || t == 4)
					System.out.print("*");
			}
			if (r == 0 || r == 2 || r == 4)
				System.out.println();
		}
		for (int r = 0; r <= 6; r++) {
			if (r % 2 == 0) {
				continue;
			}
			for (int t = 0; t < r; t++) {

				System.out.print("*");
			}

			System.out.println();
		}
		int age = 25;
		switch (age) {
		case 25:
			System.out.println("ya��n�z 25");
			break;
		case 26:
			System.out.println("ya��n�z 26");
			break;
		case 30:
			System.out.println("ya��n�z 30");
			break;
		default:
			System.out.println("ya��n�z� bulamad�k");
			break;
		}

		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
