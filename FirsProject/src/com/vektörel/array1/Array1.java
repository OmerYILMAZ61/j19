package com.vekt�rel.array1;

import java.util.Calendar;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dizi ka� Elemanl� olsun?");
		int[] dizVer = new int[sc.nextInt()];
	
		try {
			for(int i = 0;i<5;i++){
			System.out.println( (i +1) + ". Degeri Gir");
			dizVer[i] = sc.nextInt();
			//int value = 5/0;
			}
		} catch (Exception e) {
			System.out.println("Fazla De�er Girildi/"  );
			e.printStackTrace();
			//int value = 5/0;
		}finally {
			System.out.println("Finaly"); // her daim �al���r 
		}
		
		Calendar.getInstance();//zaman� long de�er olarak g�nderir.
		IArray islem = new ArrayS�n�f(dizVer);
		//dizVer[] = {25,33,44,21,11,9,18,28,32};
		IArrayMax islemMax = new ArrayS�n�f(dizVer);
		
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		System.out.println("Tekler");
		islem.tekBul();
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		System.out.println("�iftler");
		islem.ciftBul();
		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
		islemMax.makBul();
//		System.out.println("Tekler");
//		islem.tekBul(dizVer);
//		System.out.println("*-*--*-*-*-*-*-*-*-*-*");
//		System.out.println("�iftler");
//		islem.ciftBul(dizVer);
//		System.out.println("*-*--*-*-*-*-*-*-*-*-*");

		
	}
}
