package com.vektörel.array1;

import java.util.Calendar;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizi kaç Elemanlý olsun?");
		int[] dizVer = new int[sc.nextInt()];
	
		try {
			for(int i = 0;i<5;i++){
			System.out.println( (i +1) + ". Degeri Gir");
			dizVer[i] = sc.nextInt();
			//int value = 5/0;
			}
		} catch (Exception e) {
			System.out.println("Fazla Deðer Girildi/"  );
			e.printStackTrace();
			//int value = 5/0;
		}finally {
			System.out.println("Finaly"); // her daim çalýþýr 
		}
		
		Calendar.getInstance();//zamaný long deðer olarak gönderir.
		IArray islem = new ArraySýnýf(dizVer);
		//dizVer[] = {25,33,44,21,11,9,18,28,32};
		IArrayMax islemMax = new ArraySýnýf(dizVer);
		
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		System.out.println("Tekler");
		islem.tekBul();
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		System.out.println("Çiftler");
		islem.ciftBul();
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		islemMax.makBul();
//		System.out.println("Tekler");
//		islem.tekBul(dizVer);
//		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
//		System.out.println("Çiftler");
//		islem.ciftBul(dizVer);
//		System.out.println("*-*--*-*-*-*-*-*-*-*-*");

		
	}
}
