package com.vekt�rel.benimhatam;

import java.net.ConnectException;

public class VeriTabani {

	public void baglan() throws ConnectException{
		throw new ConnectException("veritaban� yok");
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
		VeriTabani veriTaban� = new VeriTabani();
		//veriTaban�.baglan(); //k�zar
		veriTaban�.islemYap();
		
	}
}
