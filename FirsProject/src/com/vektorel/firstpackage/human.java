package com.vektorel.firstpackage;

import java.util.Scanner;

public class human {
	public static void main(String[] args) {
		human human=new human();
				
		Scanner sc = new Scanner(System.in);
		int i = 0;
		do {
			i = sc.nextInt();
			if(i>4 || i<0){
				System.out.println("adam gibi deger gir");
			}
		} while(i>5 || i<0);
			
		
		switch (i) {
		case 1:
			human.akciger("oksijen");
			break;
		case 2:
			human.bobrek("ure");
			break;
		case 3:
			human.karaciger("toksit");
			break;

		default:
			System.out.println("gitti");
			break;
		}

	}

	public void akciger(String oksijen) {
		System.out.println("nefes alýyorum");

	}

	public void bobrek(String ure) {
		System.out.println("nefes alýyorum");

	}

	public void karaciger(String toksit) {
		System.out.println("nefes alýyorum");

	}

}
