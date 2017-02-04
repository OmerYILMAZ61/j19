package com.vektorel.sinif;

import java.util.Scanner;

public class Hesaplama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Muhasebeci muhasebeci = new Muhasebeci();
		double fiyat; 
		System.out.println("kdvsiz fiyatý giriniz");
		fiyat = sc.nextInt();
		System.out.println("kdvli fiyatý " + muhasebeci.kdvHesapla(fiyat) + "TL");
		
		
		
		
		
		
	}
}
