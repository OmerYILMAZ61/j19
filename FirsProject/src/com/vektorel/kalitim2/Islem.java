package com.vektorel.kalitim2;



public class Islem {

	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan();
		//hayvandan gelen
		hayvan.boy();
		hayvan.kilo();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Omurgalilar omurgalilar = new Omurgalilar();
		//hayvandan gelen
		omurgalilar.boy();
		omurgalilar.kilo();
		//omurgalýdan gelen
		omurgalilar.yurumek();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Omurgasizlar omurgasizlar = new Omurgasizlar();
		//hayvandan gelen
		omurgasizlar.boy();
		omurgasizlar.kilo();
		//omurgasýzdan gelen
		omurgasizlar.surunmek();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		SýicakKanli sicakkanli = new SýicakKanli();
		//hayvandan gelen
		sicakkanli.boy();
		sicakkanli.kilo();
		//omurgalýdan gelen
		sicakkanli.yurumek();
		//sýcakkanlýdan gelen
		sicakkanli.barinma();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		SogukKanli sogukkanli = new SogukKanli();
		//hayvandan gelen
		sogukkanli.boy();
		sogukkanli.kilo();
		//omurgalýdan gelen
		sogukkanli.yurumek();
		//sogukkanlýdan gelen
		sogukkanli.kisUykusu();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
	}
}
