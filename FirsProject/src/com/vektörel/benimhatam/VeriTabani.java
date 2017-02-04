package com.vektörel.benimhatam;

import java.net.ConnectException;

public class VeriTabani {

	public void baglan() throws ConnectException{
		throw new ConnectException("veritabaný yok");
	}
	
	public void islemYap() {
		try {
			baglan();
		} catch (ConnectException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		VeriTabani veriTabaný = new VeriTabani();
		//veriTabaný.baglan(); //kýzar
		veriTabaný.islemYap();
		
	}
}
