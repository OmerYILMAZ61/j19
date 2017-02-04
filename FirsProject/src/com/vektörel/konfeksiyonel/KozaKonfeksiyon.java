package com.vektörel.konfeksiyonel;

public class KozaKonfeksiyon extends AKonfeksiyonel{

	
	public double satýnAlma(int fiyat, int miktar,int deger) {
		double a = super.satýnAlma(fiyat, miktar);
		a = a - deger;
		return a;
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
