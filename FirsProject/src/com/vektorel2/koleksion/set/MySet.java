package com.vektorel2.koleksion.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public Set<String> veriDoldur(String[] array) {
		Set<String> mySet = new HashSet<String>();

		// iki for da ayný !!
		for (String s : array) {// for each !
			mySet.add(s);
		}
		return mySet;

		// for (int i = 0; i < array.length; i++) {
		// String s = array[i];
		// }

	}
	public void veriOku(Set<String> mySet) {
		// for(String s : mySet){
		// System.out.println(s);
		// }
		//
		Iterator<String> iterator = mySet.iterator();
		// iterator.next();
		// iterator.remove();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// tekrara okumak içiþ !
		// iterator = mySet.iterator();
		//
		// while (iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }
	}

	public Set<String> indexliVeriDoldur(String[] array) {
		Set<String> veri = new LinkedHashSet<>();
		for (String s : array) {
			veri.add(s);
		}

		return veri;
	}

	public Set<String> treeVeriDoldur(String[] array) {
		Set<String> veri = new TreeSet<>();
		for (String s : array) {
			veri.add(s);
		}
		return veri;
	}

}
