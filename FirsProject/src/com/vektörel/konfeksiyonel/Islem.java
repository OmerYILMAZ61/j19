package com.vektörel.konfeksiyonel;

public class Islem {

	public static void main(String[] args) {

		MarkaKonfeksiyon markaKonfeksiyon = new MarkaKonfeksiyon();
		KozaKonfeksiyon kozaKonfeksiyon = new KozaKonfeksiyon();

		// System.out.println(markaKonfeksiyon.satınAlma(20, 10));
		// System.out.println(markaKonfeksiyon.toptancıdanAlma(10, 10, 5));
		// markaKonfeksiyon.kumasKesmek();
		//
		// System.out.println(markaKonfeksiyon.toptancıdanAlma(10, 10, 5));
		// System.out.println(kozaKonfeksiyon.toptancıdanAlma(10, 200, 2));
		// kozaKonfeksiyon.kumasKesmek();

		double hesap = kozaKonfeksiyon.satınAlma(10, 5);
		System.out.println(hesap);
		double hesap2 = kozaKonfeksiyon.satınAlma(10, 5, 10);
		System.out.println(hesap2);

		System.out.println(markaKonfeksiyon.satınAlma(10, 5));
		double hesap3 = kozaKonfeksiyon.satınAlma(10, 5);
		System.out.println(hesap3);								

		
	}
}
