package com.vektörel.Idenemeinterface;

public class Volvo implements IAraba,IKaportaci{

	private String ismim = "volvo";
	
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
		System.out.println("Volvo - fren sistemi devrede");
		karaduzen();
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		
	}

	private void karaduzen(){
		System.out.println("karaduzen fren sistemi");
	}

	@Override
	public void macun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boya() {
		System.out.println("boya oldu");
		
	}

	@Override
	public void boya(String boya) {
		System.out.println(this.ismim +" "+ boya + " boya oldu");
		
	}






}
