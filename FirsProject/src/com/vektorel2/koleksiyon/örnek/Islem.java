package com.vektorel2.koleksiyon.�rnek;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

public class Islem {

	public static void main(String[] args) {
		VeriTabani veriTabani = new VeriTabani();
		
		Map<File, Person> myMap = veriTabani.dosyalar�Cek("C:/kisiler");
		
		for (Entry<File, Person> en : myMap.entrySet()) {
			System.out.println("*-*-*-*-*-*-*-*-*-*-*");
			System.out.println(en.getKey().getName());
			en.getValue().veriYaz();
		}
		
	}
}
