package com.vektorel.oyun;

import java.util.Scanner;

public class Oyun {

	char[] de�er ;
	char[] girilenler;
	char[] kar�ila�anKelime;
	
	public Oyun(String string) {
		de�er = new char[string.length()];
		for(int i = 0 ; i< string.length();i++){
			de�er[i] = string.charAt(i);
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
	public void kar�ila�tir() {
		kar�ila�anKelime = new char[de�er.length];
		for (int i = 0; i < de�er.length; i++) {
			for (int j = 0; j < girilenler.length; j++) {
				if(de�er[i] == girilenler[j]){
					kar�ila�anKelime[i] =de�er[i];
				}
			}
		}
	}
	public void sonucYaz() {
		for (int i = 0; i < de�er.length; i++) {
			if(kar�ila�anKelime[i]==de�er[i]){
				System.out.print(de�er[i]);
			}
			else
			{
				System.out.print("*");
			}
		}
	}

	
}
