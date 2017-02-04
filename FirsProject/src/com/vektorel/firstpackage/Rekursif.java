package com.vektorel.firstpackage;

import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

import javax.management.timer.Timer;

public class Rekursif {

	public int faktoriyel(int value) {
		if (value == 1) {

			return 1;

		}
		return value * faktoriyel(value - 1);

	}

	public String isimYazma(int value) {
		if (value == 1) {
			return "\n�mer ";
		}
		return "\n�mer" + isimYazma(value - 1);
	}

	public void writename(int value) {
		if (value == 0) {
			return;
		}

		System.out.println("omer");
		writename(value - 1);
	}

	public int fibo(int value) {

		if (value == 0) {
			return 0;
		}
		if (value == 1) {
			return 1;
		}
		return fibo(value - 1) + fibo(value - 2);
	}

	public double usAl(double a, double b) {

		if (b == 0) {
			return 1;
		}
		if (a == 1) {
			return 1;
		}
		if (b < 0) {
			return 1 / a * usAl(a, b + 1);
		}

		return a * usAl(a, b - 1);

	}

	public static void main(String[] args) {

		/*
		 * Rekursif rekursif = new Rekursif(); Scanner sc = new
		 * Scanner(System.in);
		 * System.out.println("ka� faktoriyel almak istiyorsunuz ?"); int rakam1
		 * = sc.nextInt(); System.out.println(rekursif.faktoriyel(rakam1));
		 * System.out.println("ka� defa isminizi yazmak istiyorsunuz?"); int
		 * rakam2 = sc.nextInt();
		 * System.out.println(rekursif.isimYazma(rakam2));
		 * System.out.println("isminiz 5 defa yaz�lacak");
		 * rekursif.writename(5);
		 * 
		 * System.out.println("ka� fino hesaplamak istiosun ?"); int a =
		 * sc.nextInt(); System.out.println("sonu� " + rekursif.fibo(a));
		 */
		Rekursif rekursif = new Rekursif();
		Scanner sc = new Scanner(System.in);
		System.out.println("taban de�eri giriniz");
		double a = sc.nextInt();
		System.out.println("�st de�eri giriniz");
		double b = sc.nextInt();
		System.out.println(rekursif.usAl(a, b));

	}

}
