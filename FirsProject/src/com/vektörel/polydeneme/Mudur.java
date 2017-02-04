package com.vektörel.polydeneme;

public class Mudur extends Calisan {

	int kidem;
	
	
	@Override
	public int maasAl() {
		// TODO Auto-generated method stub
		return kidem*sabitMaas;
	}
	@Override
	public String kimsin(){
		return "mudur ";
	}
	
	public Mudur() {
		
	}

	public Mudur(int i){
		kidem = i;
		
	}


}
