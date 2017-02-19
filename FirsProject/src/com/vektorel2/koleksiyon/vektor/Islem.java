package com.vektorel2.koleksiyon.vektor;

import java.util.List;
import java.util.Vector;

public class Islem {

	public static void main(String[] args) {
		List<String> vektor = new Vector<>();

		vektor.add("ahmet");
		vektor.add("mehmet");
		vektor.add("mustafa");

		for (int i = 0; i < vektor.size(); i++) {
			System.out.println(vektor.get(i));

		}
		vektor.remove("mehmet");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*");
		for (int i = 0; i < vektor.size(); i++) {
			System.out.println(vektor.get(i));

		}

	}
}
