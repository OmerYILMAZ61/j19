package com.vekt�rel.konfeksiyonel;

public class MarkaKonfeksiyon extends AKonfeksiyonel {

	
	@Override
	public double sat�nAlma(int fiyat, int miktar) {
		super.setKdv(10);
		
		return super.sat�nAlma(fiyat, miktar);
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
