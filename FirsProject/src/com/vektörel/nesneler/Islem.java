package com.vektörel.nesneler;

public class Islem {

	public static void main(String[] args) {
		
		Integer deg = 5;
		
		deg.toString();
		
		
		
		
		
		Object tahta = new Tahta();
		//System.out.println(tahta.toString());// to string fonkisyonuda ezilebilir !
		
		Object ates = new Ates();
		//System.out.println(ates.toString());
		
		Object toprak = new Toprak();
		//System.out.println(toprak.toString());
		
		tipiSoyle(ates);
	
	
	}

	private static void tipiSoyle(Object obj) {

//		if(obj.toString().equals("tahta")){
//			
//			Tahta tahta = (Tahta) obj;
//			tahta.cinsiniSoyle();
//		}
//		
		
		if(obj instanceof Tahta){
			((Tahta)obj).cinsiniSoyle();
		}else if(obj instanceof Ates){
			Ates ates = (Ates) obj;
			ates.cinsiniSoyle();
		}else if(obj instanceof Toprak){
			Toprak toprak = (Toprak) obj;
			toprak.cinsiniSoyle();
		}
		
		
	}
}
