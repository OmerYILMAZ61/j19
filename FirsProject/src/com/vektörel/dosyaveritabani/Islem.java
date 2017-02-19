package com.vektörel.dosyaveritabani;

import java.io.File;

public class Islem {

	public static void main(String[] args) {
		
		DosyaIslemleri dosyaIslemi= new DosyaIslemleri();
		File file = dosyaIslemi.DosyaBulucu("Omer YILMAZ.txt", "C:/kisi");
		if(file != null){
		Okuyucu oku = new Okuyucu();
			oku.okuma(file);
		}
		
	}
}
