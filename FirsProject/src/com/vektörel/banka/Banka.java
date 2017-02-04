package com.vektörel.banka;

public class Banka {

	
	Dolar dolar;
	Tl tl;
	
	public Banka(){
		System.out.println("banka nesnesi oluþtu");
	}

	public Dolar getDolar() {
		return dolar;
	}

	public void setDolar(Dolar dolar) {
		this.dolar = dolar;
	}

	public Tl getTl() {
		return tl;
	}

	public void setTl(Tl tl) {
		this.tl = tl;
	}

	public Banka(Dolar dolar) {
		this.dolar=dolar;
	}

	public Banka(Tl tl) {
		this.tl=tl;
	}

	public Banka(Tl tl, Dolar dolar) {
		this.tl=tl;
		this.dolar=dolar;
	}

}
