package com.vekt�rel.konfeksiyonel;

public class KozaKonfeksiyon extends AKonfeksiyonel{

	
	public double sat�nAlma(int fiyat, int miktar,int deger) {
		double a = super.sat�nAlma(fiyat, miktar);
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
