package com.vekt�rel.hatalar;

public class ArrayIslem {

	public static void main(String[] args) {

		int[] hataliList = new int[3];

		try {

			hataliList[0] = 10;
			hataliList[1] = 20;
			hataliList[2] = 30;
			System.out.println(" hata �ncesi ");

			hataliList[3] = 40;
			//hata sonras� devam etmez !
			System.out.println(" hata sonras� ");

		} catch (Exception e) {

		System.out.println(" Bir �eyler Ynal�� Gidiyor " + e);
		e.printStackTrace();
		
		
		}

		System.out.println(" her�ey yolunda ");

		
	}
}
