package com.vektörel.konfeksiyonel;

public class Islem {

	public static void main(String[] args) {

		MarkaKonfeksiyon markaKonfeksiyon = new MarkaKonfeksiyon();
		KozaKonfeksiyon kozaKonfeksiyon = new KozaKonfeksiyon();

		// System.out.println(markaKonfeksiyon.satýnAlma(20, 10));
		// System.out.println(markaKonfeksiyon.toptancýdanAlma(10, 10, 5));
		// markaKonfeksiyon.kumasKesmek();
		//
		// System.out.println(markaKonfeksiyon.toptancýdanAlma(10, 10, 5));
		// System.out.println(kozaKonfeksiyon.toptancýdanAlma(10, 200, 2));
		// kozaKonfeksiyon.kumasKesmek();

		double hesap = kozaKonfeksiyon.satýnAlma(10, 5);
		System.out.println(hesap);
		double hesap2 = kozaKonfeksiyon.satýnAlma(10, 5, 10);
		System.out.println(hesap2);

		System.out.println(markaKonfeksiyon.satýnAlma(10, 5));
		double hesap3 = kozaKonfeksiyon.satýnAlma(10, 5);
		System.out.println(hesap3);								

		
	}
}
