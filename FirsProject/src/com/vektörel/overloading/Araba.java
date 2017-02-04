package com.vektörel.overloading;

public class Araba {

	public Araba() {
		System.out.println("Araba Nesnesi Oluşturuldu");
	}

	public Araba(int arabaid) {
		System.out.println("Araba int id: " + arabaid + " nesnesi oluşturuldu");
	}

	public Araba(double arabaid) {
		System.out.println("Araba double id: " + arabaid + " nesnesi oluşturuldu");
	}

	public Araba(String arabaid) {
		System.out.println("Araba String id: " + arabaid + " nesnesi oluşturuldu");
	}

	protected Araba(int id, String name) {
		System.out.println("int iki paramatli ID: " + id + " NAME: " + name);
	}

	protected Araba(String id, String name) {
		System.out.println("string iki paramatli ID: " + id + " NAME: " + name);
	}

	public Araba(Toyota toyota) {

		System.out.println("toyota nesnesi gönderildi");

	}

	public Araba(Volvo volvo) {

		System.out.println("volvo nesnesi gönderildi");

	}

	public Araba(Fiat fiat) {

		System.out.println("fiat nesnesi gönderildi");

	}

	public Araba(Fiat fiat, Volvo volvo) {
		System.out.println("aldı");
		System.out.println(fiat.getId() + " " + fiat.getName() + " " + volvo.getId() + " " + volvo.getName() + " "
				+ volvo.getModel());
	}

}
