package com.vektörel.cons;

import com.vektörel.cons.pro.Fotokopi;
import com.vektörel.publicdeneme.Kagýt;

public class Kirtasiye {

	public static void main(String[] args) {

		// Cetvel cetvel = new Cetvel();
		// Defter defter = new Defter();
		// Kalem kalem = new Kalem();

//		Cetvel cetvel = new Cetvel(0, "cetvel");
//		Defter defter = new Defter(0, "defer");
//		Kalem kalem = new Kalem(0, "kalem");
//
//		cetvelOku(cetvel);
//		System.out.println("*********************");
//		defterOku(defter);
//		System.out.println("*********************");
//		kalemOku(kalem);
//		System.out.println("*********************");
//		cetvel.oku();
//		System.out.println("*********************");
//		kalem.oku();
//		System.out.println("*********************");
//		defter.oku();
//		System.out.println("*********************");
//		System.out.println(cetvel.Isimsoyle());
//		System.out.println("*********************");
//		System.out.println(kalem.Isimsoyle());
//		System.out.println("*********************");
//		System.out.println(defter.Isimsoyle());
//		System.out.println("*********************");
		
//		Kagýt kagit = new Kagýt();
//		int p = kagit.getId(); 
//		System.out.println(p);
//		System.out.println(kagit.getName());
		
		Fotokopi fotokopi = new Fotokopi();
		int fotokopiId = fotokopi.id;
		String fotokopiName = fotokopi.getName();
		
		Canta canta = new Canta();
		int a = canta.getId();
		String t = canta.getName();
		
		System.out.println(a);
		System.out.println(t);
	}

	public static void cetvelOku(Cetvel cetvel) {
		System.out.println(cetvel.getId());
		System.out.println(cetvel.getName());

	}

	public static void defterOku(Defter defter) {
		System.out.println(defter.getId());
		System.out.println(defter.getName());

	}

	public static void kalemOku(Kalem kalem) {
		System.out.println(kalem.getId());
		System.out.println(kalem.getName());

	}

}
