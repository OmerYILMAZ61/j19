package com.vektorel2.koleksiyon.örnek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VeriTabani {
	Scanner sc;

	public Map<File, Person> dosyalarýCek(String path) {
		Map<File, Person> myMap = new LinkedHashMap<>();

		File dFile = new File(path);
		if (dFile.exists()) {
			System.out.println("dosya açýldý");
		
		if (dFile.isDirectory()) {
			File[] dosyaIsimleri = dFile.listFiles();
			for (int i = 0; i < dosyaIsimleri.length; i++) {

				Person personNesnesi = dosyadakiVerileriOku(dosyaIsimleri[i]);
				myMap.put(dosyaIsimleri[i], personNesnesi);

			}
		}
		}
		return myMap;
	}

	private Person dosyadakiVerileriOku(File file) {

		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Person person = new Person(sc.nextInt(), sc.next(), sc.next(), sc.next());

		return person;
	}

}
