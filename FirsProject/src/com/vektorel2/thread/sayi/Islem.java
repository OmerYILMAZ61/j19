package com.vektorel2.thread.sayi;

public class Islem {

	public static void main(String[] args) {
		Sayi1 sayi1 = new Sayi1();
		Sayi2 sayi2 = new Sayi2();
		
		Thread isParcacigi1 = new Thread(sayi1);
		Thread isParcacigi2 = new Thread(sayi2);

		isParcacigi1.start();
		System.out.println("alt sat�r");
		
		isParcacigi2.start();
		
		isParcacigi1.interrupt();
		
		
		
	}
}
