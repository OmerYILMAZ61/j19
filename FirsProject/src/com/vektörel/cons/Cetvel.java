package com.vekt�rel.cons;

public class Cetvel {

	private int id;
	private String name;

	// ***********************Cons*****************//
	public Cetvel() {
		System.out.println("cetvel olu�turuldu");
	}

	public Cetvel(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//***********************��lem*****************//
	public void oku() {
		System.out.println(this.id);
		System.out.println(this.name);

	}

	public String Isimsoyle() {
		return name;

	}
	//***********************Setter Getter*****************//
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
