package com.vektorel.firstpackage;

import java.util.Scanner;

public class SiralamaOdevi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ka� rakam girmek istiyorsunuz ?");
		int count = sc.nextInt();
		int value = 0;
		System.out.println("1.rakam� giriniz");
		value = sc.nextInt();
		int min = value;
		int max = value;
		for (int i = 1; i < count; i++) {
			System.out.println((i + 1) + ". rakam� giriniz");
			value = sc.nextInt();
			if (value < min) {
				min = value;
			} else if (value > max) {
				max = value;
			}
		}
		System.out.println("min de�er " + min);
		System.out.println("max de�er " + max);

	}
}
