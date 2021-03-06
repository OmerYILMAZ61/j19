package com.vektorel.kalıtım3;

public class HizArabasi extends Araba {

	protected int turboMiktarı;
	protected String aksesuar;

	public void turboYap() {
		System.out.println("Hız Arabası - Turbo Yap");

	}
	
	@Override
	public void yaz() {
		super.yaz();
		System.out.println(turboMiktarı);
		System.out.println(aksesuar);
	}

	@Override
	public void hareketEt() {
		System.out.println("Hız Arabası - Hareket Et");
	}

	public int getTurboMiktarı() {
		return turboMiktarı;
	}

	public void setTurboMiktarı(int turboMiktarı) {
		this.turboMiktarı = turboMiktarı;
	}

	public String getAksesuar() {
		return aksesuar;
	}

	public void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}

}
