package com.vektorel2.koleksion.dev;

import java.util.Set;

public class Islem {

	public static void main(String[] args) {
		MySet mySet = new MySet();
		
		Set<String> veri = mySet.veriGir();
		System.out.println("-*-*-*-*-*-*-*-*--");
		Set<String> veriLinked = mySet.linkedVeriGir();
		System.out.println("-*-*-*-*-*-*-*-*--");
		Set<String> veriTree = mySet.TreeVeriGir();
		System.out.println("-*-*-*-*-*-*-*-*--");
		mySet.veriOku(veri);
		System.out.println("-*-*-*-*-*-*-*-*--");
		mySet.veriOku(veriLinked);
		System.out.println("-*-*-*-*-*-*-*-*--");
		mySet.veriOku(veriTree);
		System.out.println("-*-*-*-*-*-*-*-*--");
		
	}
}
