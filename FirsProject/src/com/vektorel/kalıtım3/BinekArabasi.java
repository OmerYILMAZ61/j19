package com.vektorel.kal�t�m3;

public class BinekArabasi extends Araba {

	private boolean tup = false;

	public void tupeGec(){
		
		System.out.println("Binek Araba - Tupe Ge�");
	}

	@Override
	public void fren() {
		System.out.println("Binek Araba - Fren");
	}

	public boolean isTup() {
		return tup;
	}

	public void setTup(boolean tup) {
		this.tup = tup;
	}
	
	
}
