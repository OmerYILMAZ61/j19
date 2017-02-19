package com.vektorel2.koleksiyon.list;

import java.util.List;

public class Islem {

	public static void main(String[] args) {
		String[] array = { "domates", "salça ", "torpak", "tavuk" };

		MyList myList = new MyList();
		List<String> dolmusList = myList.veriDoldur(array);
		
		dolmusList.contains("salça");
		
		myList.veriOku(dolmusList);
	}
}
