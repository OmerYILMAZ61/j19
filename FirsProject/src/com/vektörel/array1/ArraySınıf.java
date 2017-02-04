package com.vektörel.array1;

public class ArraySýnýf implements IArray,IArrayMax {

	int[] dizi;

//	public ArraySýnýf() {
//
//	}

	public ArraySýnýf(int[] dizi) {

		this.dizi = dizi;
	}

	public void tekBul() {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 1) {
				System.out.print(dizi[i] + " ");

			}
		}
		System.out.println();
	}

	public void ciftBul() {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				System.out.print(dizi[i] + " ");

			}
		}
		System.out.println();
	}

	@Override
	public void makBul() {
		int ilk = this.dizi[0];
		for(int i =0;i<this.dizi.length;i++){
			if(ilk<this.dizi[i])
				ilk=this.dizi[i];
		}
		System.out.println("maks deðer " + ilk);
	}

//	public void tekBul(int[] dizVer) {
//		for (int i = 0; i < dizVer.length; i++) {
//			if (dizVer[i] % 2 == 1) {
//				System.out.print(dizVer[i] + " ");
//
//			}
//		}
//		System.out.println();
//	}
//
//	public void ciftBul(int[] dizVer) {
//		for (int i = 0; i < dizVer.length; i++) {
//			if (dizVer[i] % 2 == 0) {
//				System.out.print(dizVer[i] + " ");
//
//			}
//		}
//		System.out.println();
//	}

	
	
	
}
