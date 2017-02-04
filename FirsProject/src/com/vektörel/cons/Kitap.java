package com.vektörel.cons;

public class Kitap {

	private String barkod;
	private String ismi;
	private int id;

	public Kitap() {
		System.out.println("kitap nesnesi oluþtu");
	}

	public Kitap(String barkod) {

		this.barkod = barkod;
	}

	public Kitap(String barkod, String ismi) {
		this.barkod = barkod;
		this.ismi = ismi;
	}

	public Kitap(String barkod, String ismi, int id) {
		
		this.id = id;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getIsmi() {
		return ismi;
	}

	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
