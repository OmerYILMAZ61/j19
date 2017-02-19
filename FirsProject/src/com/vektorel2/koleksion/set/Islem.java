package com.vektorel2.koleksion.set;

import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		String[] array = { "ömer", "selin", "pelin","ali","ahmet" };
		MySet mySet = new MySet();
		Set<String> veri = mySet.veriDoldur(array);
		Set<String> indexliVeri = mySet.indexliVeriDoldur(array);
		Set<String> treeVeri = mySet.treeVeriDoldur(array);
		
		if (!veri.isEmpty()) {
			mySet.veriOku(veri);
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*");
		
		if (!indexliVeri.isEmpty()) {
			mySet.veriOku(indexliVeri);
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*");

		if (!treeVeri.isEmpty()) {
			mySet.veriOku(treeVeri);
		}

	}

}
