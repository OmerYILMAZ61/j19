package com.vektörel.object;

public class Islem {

	public static void main(String[] args) {

		Object monitor = new Monitor();
		Object sandalye = new Sandalye();

		kimsinSoyle(monitor);

		kimsinSoyle(sandalye);

	}

	private static void kimsinSoyle(Object obj) {
		if (obj instanceof Monitor) {
			Monitor mon = (Monitor) obj;
			System.out.println(mon.kimsin);
		}

		if (obj instanceof Sandalye) {
			Sandalye san = (Sandalye) obj;
			System.out.println(san.kimsin);
		}

	}
}
