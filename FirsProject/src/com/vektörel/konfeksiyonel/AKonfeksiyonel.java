package com.vekt�rel.konfeksiyonel;

public abstract class AKonfeksiyonel {

	private int kdv = 18;
	
	abstract public void kumasTuru();
	abstract public void kumasTuru(int deger);
	abstract public void kumasTuru(int deger,int deger1);
	
	
	public double sat�nAlma(int fiyat,int miktar){
		
		double hesap = fiyat*miktar;
		hesap = hesap + (hesap/100*kdv );
		return hesap;
		
	}

	public double toptanc�danAlma(int fiyat,int miktar,int komisyon){
		double hesap = fiyat*komisyon;
		hesap = hesap + (hesap/100*komisyon);
		return hesap;
	}

	public void kumasKesmek(){
		System.out.println("kuma� kestik");
	}

	public int getKdv() {
		return kdv;
	}

	public void setKdv(int kdv) {
		this.kdv = kdv;
	}

	
}

