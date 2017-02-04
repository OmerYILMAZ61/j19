package com.vektorel.sinif2;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) {
		int a=0;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("yarýcap giriniz");
		a=sc.nextInt();
		Daire daireTipi = new Daire();
		System.out.println("alaný " + daireTipi.alanHesapla(a));
		*/
		GeometrikSekiller geo = new GeometrikSekiller();
		//GeometrikSekiller.Daire daire = geo. new Daire();
		//daire.alanHesapla(10);
		GeometrikSekiller.Kare kare = geo. new Kare();
		kare.alanHesapla(10);
		
	}
}
