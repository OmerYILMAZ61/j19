package com.vektorel2.koleksiyon.list;

import java.util.List;

public class Islem {

	public static void main(String[] args) {
		String[] array = { "domates", "sal�a ", "torpak", "tavuk" };

		MyList myList = new MyList();
		List<String> dolmusList = myList.veriDoldur(array);
		
		dolmusList.contains("sal�a");
		
		myList.veriOku(dolmusList);
	}
}
