package com.swingvektorel.dosyaokuyucu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Okuyucu {
	Scanner sc ;
	
	public String dosyaOku(File file){
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		StringBuilder doldur = new StringBuilder();
		while(sc.hasNextLine()){
			doldur.append(sc.nextLine());
			doldur.append("\n");
		}
		
		return doldur.toString();
	}
	
}
