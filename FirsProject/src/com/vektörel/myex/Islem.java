package com.vektörel.myex;

public class Islem {

	public static void main(String[] args) throws ArrayHatalari {
		
		try {
			throw new ArrayHatalari("hatalý");
		} catch (ArrayHatalari e) {
			e.printStackTrace();
			e.arraySikintilari();
			e.getMessage();
		}
		
		int[] dizi = new int[2];
		dizi[2]=3;
		
//		
//		for(int i = 0;i<100;i++){
//			
//		}
	}
}
