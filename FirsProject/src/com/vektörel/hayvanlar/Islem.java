package com.vektörel.hayvanlar;
/**
 * 
 * @author vektorel
 *
 */

public class Islem {

	public static void main(String[] args) {
		Kaplan kaplan = new Kaplan();
		kaplan.avlan();
		kaplan.takipEt();
		
		IHayvan ikaplan = new Kaplan();
		ikaplan.avlan();
		
		Kedi aKaplan = new Kaplan();
		
		aKaplan.avlan();
		aKaplan.takipEt();
		
		IHayvan hay = new IHayvan() {
			
			@Override
			public void avlan() {
				System.out.println("avlýyorum \"runtime\"");
				
			}
		};
		
		hay.avlan();
	}
}
