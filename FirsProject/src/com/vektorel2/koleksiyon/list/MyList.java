package com.vektorel2.koleksiyon.list;

import java.util.List;
import java.util.ArrayList;
//import java.util.Iterator;

public class MyList {

	public List<String> veriDoldur(String[] array) {
		List<String> myList = new ArrayList<>();

		for (String s : array) {

			myList.add(s);
		}
		return myList;
	}

	public void veriOku(List<String> list) {
		//3 ü de aynýdýr ! içerde dolaþmak için
//		for (String s : list) {
//
//		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			iterator.next();
//		}

	}
}
