package com.vektorel.kal�t�m3;

public class HizArabasi extends Araba {

	protected int turboMiktar�;
	protected String aksesuar;

	public void turboYap() {
		System.out.println("H�z Arabas� - Turbo Yap");

	}
	
	@Override
	public void yaz() {
		super.yaz();
		System.out.println(turboMiktar�);
		System.out.println(aksesuar);
	}

	@Override
	public void hareketEt() {
		System.out.println("H�z Arabas� - Hareket Et");
	}

	public int getTurboMiktar�() {
		return turboMiktar�;
	}

	public void setTurboMiktar�(int turboMiktar�) {
		this.turboMiktar� = turboMiktar�;
	}

	public String getAksesuar() {
		return aksesuar;
	}

	public void setAksesuar(String aksesuar) {
		this.aksesuar = aksesuar;
	}

}
