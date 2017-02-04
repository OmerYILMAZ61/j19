package com.vekt�rel.Idenemeinterface;

public class Islem {

	public static void main(String[] args) {
		IAraba bmw = new Bmw();
		IAraba volvo = new Volvo();
		
		
		bmw.fren();
		volvo.fren();
		
		ITamirciBmw bmwtamir = new Bmw();	
		
		bmwtamir.frenTamir();
	
		IKaportaci volvoKaporta = new Volvo();
		
		volvoKaporta.boya();
		volvoKaporta.macun();
		
		IKaportaci bmwKaporta = new Bmw();
		
		bmwKaporta.boya("K�rm�z�");
		volvoKaporta.boya("Beyaz");
	}
}
