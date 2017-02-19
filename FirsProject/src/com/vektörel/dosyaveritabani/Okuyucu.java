package com.vektörel.dosyaveritabani;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {
	Scanner sc;

	public void okuma(File file) {
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}
}
