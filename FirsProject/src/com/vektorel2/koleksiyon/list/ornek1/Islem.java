package com.vektorel2.koleksiyon.list.ornek1;

import java.io.File;
import java.util.List;

public class Islem {

	public static void main(String[] args) {
		DosyaOku dosyaOku = new DosyaOku();
		File file = new File("c:/kisi/mylist.txt");
		List<String> list = dosyaOku.dosyaOkuma(file);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
