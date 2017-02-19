package com.vektörel.stream;

import java.io.File;

public class Islem {

	public static void main(String[] args) {
		byte[] b;
		Dosya dosya = new Dosya();
		
		Okuyucu okuyucu = new Okuyucu();
		Yazici yazici = new Yazici();
		File file = dosya.getBenimDosyam("C:/kisi/Omer YILMAZ.txt");
		File file2  = dosya.getBenimDosyam("C:/kisi/Recep OZEN.txt");
		b = okuyucu.oku(file);
		
		yazici.yaz(file2, b);
	}
}
