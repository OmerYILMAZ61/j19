package com.vekt�rel.konfeksiyonel;

public class Islem {

	public static void main(String[] args) {

		MarkaKonfeksiyon markaKonfeksiyon = new MarkaKonfeksiyon();
		KozaKonfeksiyon kozaKonfeksiyon = new KozaKonfeksiyon();

		// System.out.println(markaKonfeksiyon.sat�nAlma(20, 10));
		// System.out.println(markaKonfeksiyon.toptanc�danAlma(10, 10, 5));
		// markaKonfeksiyon.kumasKesmek();
		//
		// System.out.println(markaKonfeksiyon.toptanc�danAlma(10, 10, 5));
		// System.out.println(kozaKonfeksiyon.toptanc�danAlma(10, 200, 2));
		// kozaKonfeksiyon.kumasKesmek();

		double hesap = kozaKonfeksiyon.sat�nAlma(10, 5);
		System.out.println(hesap);
		double hesap2 = kozaKonfeksiyon.sat�nAlma(10, 5, 10);
		System.out.println(hesap2);

		System.out.println(markaKonfeksiyon.sat�nAlma(10, 5));
		double hesap3 = kozaKonfeksiyon.sat�nAlma(10, 5);
		System.out.println(hesap3);								

		
	}
}
