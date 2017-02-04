package com.vekt�rel.overloading;

public class Araba {

	public Araba() {
		System.out.println("Araba Nesnesi Olu�turuldu");
	}

	public Araba(int arabaid) {
		System.out.println("Araba int id: " + arabaid + " nesnesi olu�turuldu");
	}

	public Araba(double arabaid) {
		System.out.println("Araba double id: " + arabaid + " nesnesi olu�turuldu");
	}

	public Araba(String arabaid) {
		System.out.println("Araba String id: " + arabaid + " nesnesi olu�turuldu");
	}

	protected Araba(int id, String name) {
		System.out.println("int iki paramatli ID: " + id + " NAME: " + name);
	}

	protected Araba(String id, String name) {
		System.out.println("string iki paramatli ID: " + id + " NAME: " + name);
	}

	public Araba(Toyota toyota) {

		System.out.println("toyota nesnesi g�nderildi");

	}

	public Araba(Volvo volvo) {

		System.out.println("volvo nesnesi g�nderildi");

	}

	public Araba(Fiat fiat) {

		System.out.println("fiat nesnesi g�nderildi");

	}

	public Araba(Fiat fiat, Volvo volvo) {
		System.out.println("ald�");
		System.out.println(fiat.getId() + " " + fiat.getName() + " " + volvo.getId() + " " + volvo.getName() + " "
				+ volvo.getModel());
	}

}
