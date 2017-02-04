package com.vektörel.polydeneme;

public class Yazilimci extends Calisan{

	public Yazilimci(int i){
		kidem = i;
	}
	
	int kidem;
	
	@Override
	public int maasAl() {
		return kidem*sabitMaas;
	}

	@Override
	public String kimsin(){
		return "yazilimci";
	}
	
}
