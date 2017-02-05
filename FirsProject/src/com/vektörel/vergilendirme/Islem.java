package com.vektörel.vergilendirme;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {

		String isim;
		int kar;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("isim giriniz");

			isim = sc.nextLine();
			if (!(isim.equals("ahmet") || isim.equals("mehmet") || isim.equals("hasan"))) {
				throw new VergiHatalari("isim hatalý");
			} 
			System.out.println("kar giriniz");
			kar = sc.nextInt();
			if (kar < 0) {

				throw new VergiHatalari("kar hatalý");
			}
			double vergi = (kar/100*40);
			System.out.println("vergi " + vergi );
		} catch (VergiHatalari e) {
			e.myMassage();
		}finally {
			sc.close();
		}
		
	}
}
