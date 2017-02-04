package com.vektörel.konfeksiyonel;

public class MarkaKonfeksiyon extends AKonfeksiyonel {

	
	@Override
	public double satýnAlma(int fiyat, int miktar) {
		super.setKdv(10);
		
		return super.satýnAlma(fiyat, miktar);
	}

	@Override
	public void kumasTuru() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kumasTuru(int deger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kumasTuru(int deger, int deger1) {
		// TODO Auto-generated method stub
		
	}
}
