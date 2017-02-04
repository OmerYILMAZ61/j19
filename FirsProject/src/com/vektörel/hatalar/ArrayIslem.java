package com.vektörel.hatalar;

public class ArrayIslem {

	public static void main(String[] args) {

		int[] hataliList = new int[3];

		try {

			hataliList[0] = 10;
			hataliList[1] = 20;
			hataliList[2] = 30;
			System.out.println(" hata öncesi ");

			hataliList[3] = 40;
			//hata sonrasý devam etmez !
			System.out.println(" hata sonrasý ");

		} catch (Exception e) {

		System.out.println(" Bir Þeyler Ynalýþ Gidiyor " + e);
		e.printStackTrace();
		
		
		}

		System.out.println(" herþey yolunda ");

		
	}
}
