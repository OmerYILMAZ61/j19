package com.vektörel.polydeneme;

public class GenelMudur extends Mudur{

	public GenelMudur(int i ){
		
		kidem = i;
	}
	
	int kidem;
	
	@Override
	public int maasAl() {
		// TODO Auto-generated method stub
		return kidem*sabitMaas;
	}
	@Override
	public String kimsin(){
		return "genel mudur";
	}

}
