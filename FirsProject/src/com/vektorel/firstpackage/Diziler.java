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
		ad[0] = '�';
		ad[1] = 'm';
		ad[2] = 'e';
		ad[3] = 'r';

		for (int i = 0; i < ad.length; i++) {
			System.out.println(ad[i]);
		}

		String[] firmaAd� = new String[]{
			"vekt�rel","bili�im","A.�."                            //de�i�ik bi dizi olu�tma y�ntemi
		};
		
		firmaAd�[1] = "B�L���M";
		
		for (int i = 0; i < firmaAd�.length; i++) {
			System.out.println(firmaAd�[i]);
		}
		
		int[][] ikiboyutluDizi = new int [2][2];
		
		
		ikiboyutluDizi[0][0] = (int)(Math.random()*10); // cast i�lemi (d�n��t�rme)
		ikiboyutluDizi[1][0] = (int)(Math.random()*10);
		ikiboyutluDizi[0][1] = (int)(Math.random()*10);
		ikiboyutluDizi[1][1] = (int)(Math.random()*10);
		
		for (int i=0; i<ikiboyutluDizi.length; i++) {				//dizinin uzunlu�u 3. boyut i�in ikiboyutluDizi[][].length kullan
			for (int j=0;j<ikiboyutluDizi[0].length;j++)
			{
				System.out.print(ikiboyutluDizi[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
