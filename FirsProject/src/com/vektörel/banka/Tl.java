package com.vektörel.banka;

public class Tl extends Para {

	private String folyoBarkod;

	public String getFolyoBarkod() {
		return folyoBarkod;
	}

	public void setFolyoBarkod(String folyoBarkod) {
		this.folyoBarkod = folyoBarkod;
	}

	public Tl() {

	}

	public Tl(String seriNo, double miktar, String folyoBarkod) {

		this.folyoBarkod = folyoBarkod;
	}

}
