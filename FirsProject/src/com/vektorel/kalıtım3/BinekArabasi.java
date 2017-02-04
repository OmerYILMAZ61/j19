package com.vektorel.kalýtým3;

public class BinekArabasi extends Araba {

	private boolean tup = false;

	public void tupeGec(){
		
		System.out.println("Binek Araba - Tupe Geç");
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
