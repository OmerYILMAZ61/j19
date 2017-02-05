package com.vektörel.dosya;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Yazici {
	PrintWriter pW;
	int sayac = 0;

		
	
	public void dosyaAc() {
		try {
			this.pW = new PrintWriter("yazici.txt");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public void veriEkle(Person person) {
		this.sayac++;
		this.pW.print((sayac)+ ".kiþi " + person.getID() + "-");
		this.pW.println(person.getName());
		
	}
	public void dosyaKapa(){
		this.pW.close();
	}

}
