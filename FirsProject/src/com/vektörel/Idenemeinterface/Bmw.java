package com.vektörel.Idenemeinterface;

public class Bmw implements IAraba,ITamirciBmw,IKaportaci {

	private String ismim = "Bmw";
	
	
	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elFreni() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fren() {
		System.out.println("BMW - fren devrede");
		abs();
		
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abs() {
		System.out.println("abs devrede");
		
	}

	@Override
	public void frenTamir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya(String boya) {
		System.out.println(this.ismim +" "+ boya + " boya oldu");
		
	}

	
}
