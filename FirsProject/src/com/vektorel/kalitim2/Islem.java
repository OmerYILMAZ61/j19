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
		//omurgal�dan gelen
		omurgalilar.yurumek();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		Omurgasizlar omurgasizlar = new Omurgasizlar();
		//hayvandan gelen
		omurgasizlar.boy();
		omurgasizlar.kilo();
		//omurgas�zdan gelen
		omurgasizlar.surunmek();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		S�icakKanli sicakkanli = new S�icakKanli();
		//hayvandan gelen
		sicakkanli.boy();
		sicakkanli.kilo();
		//omurgal�dan gelen
		sicakkanli.yurumek();
		//s�cakkanl�dan gelen
		sicakkanli.barinma();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		SogukKanli sogukkanli = new SogukKanli();
		//hayvandan gelen
		sogukkanli.boy();
		sogukkanli.kilo();
		//omurgal�dan gelen
		sogukkanli.yurumek();
		//sogukkanl�dan gelen
		sogukkanli.kisUykusu();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
	}
}
