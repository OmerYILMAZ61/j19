package com.vektörel.arraypoly;

public class Islem {

	public static void main(String[] args) {
		String[] ara = new String[6];
		int[] idiz = new int [6];
		
		Integer[] intAtaClass = {10,20,30};
		
		MuzikAlatleri muzAlet = new VurmaliCalgilar();
		muzAlet.sesVer();
		
		MuzikAlatleri muz = new MuzikAlatleri();
		muz.sesVer();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		MuzikAlatleri[] aletler = new MuzikAlatleri[3];
		
		aletler[0] = new MuzikAlatleri();
		aletler[1] = new VurmaliCalgilar();
		aletler[2] = new YayliCalgýlar();

		aletlerdenSesver(aletler);
		
	}

	private static void aletlerdenSesver(MuzikAlatleri[] aletler) {
		MuzikAlatleri alet;
		for(int i=0;i<aletler.length;i++){
			alet = aletler[i];
			alet.sesVer();
		
	}
}
}
