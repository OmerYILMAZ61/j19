package com.vektorel.sinif2;

public class GeometrikSekiller {
	String value = "geometrik þekil";
	private double h = 50;
	class Daire {
		private final double PI = 3.0;

		public void alanHesapla(double yaricap) {
			System.out.println(value);
			double sonuc = PI * yaricap * yaricap*h;
			
			System.out.println(sonuc);

		}
	}

	class Kare {
		public void alanHesapla(double kenar){
			double sonuc = kenar*kenar*h;
			System.out.println("karenin hacmi " + sonuc);
		}
	}

	class Ucgen {

	}
}
