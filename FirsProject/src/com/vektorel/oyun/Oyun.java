package com.vektorel.oyun;

import java.util.Scanner;

public class Oyun {

	char[] deðer ;
	char[] girilenler;
	char[] karþilaþanKelime;
	
	public Oyun(String string) {
		deðer = new char[string.length()];
		for(int i = 0 ; i< string.length();i++){
			deðer[i] = string.charAt(i);
		}
	}
	public void karakterGir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("harfleri giriniz");
		String girilenHarfler = sc.nextLine();
		girilenler = new char[girilenHarfler.length()];
		for (int i = 0; i < girilenHarfler.length(); i++) {
			girilenler[i] = girilenHarfler.charAt(i);
		}
	}
	public void karþilaþtir() {
		karþilaþanKelime = new char[deðer.length];
		for (int i = 0; i < deðer.length; i++) {
			for (int j = 0; j < girilenler.length; j++) {
				if(deðer[i] == girilenler[j]){
					karþilaþanKelime[i] =deðer[i];
				}
			}
		}
	}
	public void sonucYaz() {
		for (int i = 0; i < deðer.length; i++) {
			if(karþilaþanKelime[i]==deðer[i]){
				System.out.print(deðer[i]);
			}
			else
			{
				System.out.print("*");
			}
		}
	}

	
}
