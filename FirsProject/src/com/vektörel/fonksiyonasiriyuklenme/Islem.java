package com.vektörel.fonksiyonasiriyuklenme;

public class Islem {

	public static void main(String[] args) {
		Hal hal = new Hal();
		hal.fiyatHesaplaElma();
		hal.fiyatHesaplaElma(30);
		hal.fiyatHesaplaElma(30, 4);
		
		Manav buyukManav = new Manav();
		Manav kucukManav = new Manav();
		buyukManav.setBk(true);
		
		hal.fiyatHesaplaElma(100.0, kucukManav);
		hal.fiyatHesaplaElma(200.0, buyukManav);
		
		
		kucukManav.setBk(true);
		buyukManav.setBk(false);
	
		hal.fiyatHesaplaElma(100.0, kucukManav);
		hal.fiyatHesaplaElma(200.0, buyukManav);
	
		
	
	}
}
