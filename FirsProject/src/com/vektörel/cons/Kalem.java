package com.vekt�rel.cons;

public class Kalem {

	private int id;
	private String name;

	// ***********************Cons*****************//
	public Kalem() {
		System.out.println("kalem olu�turuldu");
	}

	public Kalem(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// ***********************��lem*****************//
	public void oku() {
		System.out.println(this.id);
		System.out.println(this.name);

	}

	public String Isimsoyle() {
		return name;

	}

	// ***********************Setter Getter*****************//
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
