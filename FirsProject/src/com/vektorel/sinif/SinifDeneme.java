package com.vektorel.sinif;

public class SinifDeneme {

	public static void main(String[] args) {
		Person p = new Person( 1 , "�mer", "YILMAZ",23,"EEM");
		Person p2 = p;
		p2.tc = 2; // ayn� adresi g�sterdi�inden dolay� kullan�m� s�k�nt�l�d�r. kopyalama yapmaz.
		p.yaz();
		p2.yaz();	
		String a= "dwadwad dwa dwa dwa dwa";
		String[] b = a.split(" ");
		System.out.println("kelime say�s� " + b.length);
	}

}
