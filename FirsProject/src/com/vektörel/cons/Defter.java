package com.vektörel.cons;

public class Defter {

	private int id;
	private String name;

	// ***********************Cons*****************//
	public Defter() {
		System.out.println("defter oluþturuldu");
	}

	public Defter(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// ***********************Ýþlem*****************//
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
