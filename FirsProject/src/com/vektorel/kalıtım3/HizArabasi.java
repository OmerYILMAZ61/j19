package com.vektorel.kalýtým3;

public class HizArabasi extends Araba {

	protected int turboMiktarý;
	protected String aksesuar;

	public void turboYap() {
		System.out.println("Hýz Arabasý - Turbo Yap");

	}
	
	@Override
	public void yaz() {
		super.yaz();
		System.out.println(turboMiktarý);
		System.out.println(aksesuar);
	}

	@Override
	public void hareketEt() {
		System.out.println("Hýz Arabasý - Hareket Et");
	}

	public int getTurboMiktarý() {
		return turboMiktarý;
	}

	public void setTurboMiktarý(int turboMiktarý) {
		this.turboMiktarý = turboMiktarý;
	}

	public String getAksesuar() {
		return aksesuar;
	}

	public void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}

}
