package com.vektörel.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Okuyucu {
	byte[] s;
	public byte[] oku(File file){
		try {
			FileInputStream stream  = new FileInputStream(file);
//			for (int i = 0; i < file.length(); i++) {
//				System.out.print((char)stream.read());
//			}
			byte[] byteArray = new byte[(int)file.length()];
			this.s = byteArray;
			stream.read(byteArray);
			
			String s  = new String(byteArray);
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println(s);
			stream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
		
	}
}
