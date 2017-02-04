package com.vektorel.superfutbol;

public class Futbol extends Spor {

	final double PI=3.0;
	public Futbol(){
		System.out.println("Futbol Sýnýfýndayým");
		
	}

	@Override
	public void hangiSahadasin(String sahaIsmi, String ikinci) {
		// TODO Auto-generated method stub
		final double PI;
		PI=4.0;
		// fonkisyon içinde pi final tanýmlanabilir ve sadece ilk kez setlemene izin verir !
		//PI=5.0;
		System.out.println(PI);
		System.out.println(this.PI);
		System.out.println(super.PI);
		
		super.hangiSahadasin(sahaIsmi, ikinci);
	}
	
	@Override
	public void hangiSahadasin(double sahaIsmi) {
		// TODO Auto-generated method stub
		super.hangiSahadasin(sahaIsmi);
	}

}
