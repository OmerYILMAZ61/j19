package com.vekt�rel.cons.pro;

import com.vekt�rel.cons.Canta;

public class Fotokopi {
	public int id;
	protected String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Canta canta = new Canta();
		canta.getName();
	}
}
