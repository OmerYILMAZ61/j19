package com.vektorel.islem.islem;

import com.vektorel.mavenmat.mavenmat.Matematic;

import sekiller.Ucgen;

public class Islem {

	public static void main(String[] args) {
		Matematic matematic = new Matematic();
		System.out.println(matematic.toplama(10, 20));
		System.out.println(matematic.cikarma(20, 10));
		
		Ucgen ucgen = new Ucgen();
		ucgen.icAciler();
	}
}
