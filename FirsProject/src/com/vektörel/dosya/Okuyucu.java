package com.vektörel.dosya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {
	Scanner oku;
	public void dosyaAc() {

		
		try {
			this.oku = new Scanner(new File("yazici.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (this.oku.hasNext()) {
			System.out.println(this.oku.nextLine());
		}

	}
}
