package com.vektorel2.koleksiyon.list.ornek1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//arraylist : okuma yazma iþlemi çok yapýlcaksa kullanýlcak
//linked list : 1 kere okumuyp iþlem yaparken
public class DosyaOku {
	Scanner sc;

	public List<String> dosyaOkuma(File file) {
		List<String> list = new ArrayList<>();
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			if(!s.equals("Alýþveriþ Listesi:"))
			list.add(s);
		}
		
		return list;
		

	}

}
