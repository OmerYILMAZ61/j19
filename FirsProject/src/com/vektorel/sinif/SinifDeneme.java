package com.vektorel.sinif;

public class SinifDeneme {

	public static void main(String[] args) {
		Person p = new Person( 1 , "Ömer", "YILMAZ",23,"EEM");
		Person p2 = p;
		p2.tc = 2; // ayný adresi gösterdiðinden dolayý kullanýmý sýkýntýlýdýr. kopyalama yapmaz.
		p.yaz();
		p2.yaz();	
		String a= "dwadwad dwa dwa dwa dwa";
		String[] b = a.split(" ");
		System.out.println("kelime sayýsý " + b.length);
	}

}
