package com.vektorel.firstpackage;



public class Diziler {

	public static void main(String[] args) {

		int[] dizi = new int[5];

		dizi[4] = 25;
		dizi[0] = 30;
		dizi[1] = 33;
		dizi[2] = 32;
		dizi[3] = 31;
		
		char[] ad = new char[4];
		ad[0] = 'Ö';
		ad[1] = 'm';
		ad[2] = 'e';
		ad[3] = 'r';

		for (int i = 0; i < ad.length; i++) {
			System.out.println(ad[i]);
		}

		String[] firmaAdý = new String[]{
			"vektörel","biliþim","A.Þ."                            //deðiþik bi dizi oluþtma yöntemi
		};
		
		firmaAdý[1] = "BÝLÝÞÝM";
		
		for (int i = 0; i < firmaAdý.length; i++) {
			System.out.println(firmaAdý[i]);
		}
		
		int[][] ikiboyutluDizi = new int [2][2];
		
		
		ikiboyutluDizi[0][0] = (int)(Math.random()*10); // cast iþlemi (dönüþtürme)
		ikiboyutluDizi[1][0] = (int)(Math.random()*10);
		ikiboyutluDizi[0][1] = (int)(Math.random()*10);
		ikiboyutluDizi[1][1] = (int)(Math.random()*10);
		
		for (int i=0; i<ikiboyutluDizi.length; i++) {				//dizinin uzunluðu 3. boyut için ikiboyutluDizi[][].length kullan
			for (int j=0;j<ikiboyutluDizi[0].length;j++)
			{
				System.out.print(ikiboyutluDizi[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
