package com.vekt�rel.dosyaoku;

import java.io.FileNotFoundException;

public class DosyaOku {

	public void dosyaAc() throws FileNotFoundException {
		throw new FileNotFoundException("hata = FileNotFoundException ");
	}

	public void islemYap(){
		try {
			dosyaAc();
		} catch (Exception e) {
			System.out.println("s�k�nt� var");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
