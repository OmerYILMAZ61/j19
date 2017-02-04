package com.vektörel.cons;

public class Islem {

	public static void main(String[] args) {

		Kitap kitap1 = new Kitap();
		kitap1.setBarkod("ddf5-mdg6");
		kitap1.setIsmi("zambak");
		kitap1.setId(0);
		KitapEvi kitapevi = new KitapEvi();
		kitapevi.setKitap(kitap1);
		kitapevi.setAdresi("Kýzýlay/Çankaya/Ankara");
		kitapevi.setIsim("KVektörel");

		Kitap kitap2 = new Kitap("edfg-dfhr");
		Kitap kitap3 = new Kitap("edfg-dfhr", "zambak");
		System.out.println(kitap3.getIsmi());
		// Object obj = new Kitap("dfg-dfhr", "zambak", 0);
		// new Kitap(); //bu þekilde çalýþtrýlabilir
		Kitap kitap4 = new Kitap("ddf5-mdg6", "zambak", 0);
		Kitap kitap5 = new Kitap();
		kitap5.setBarkod("ddf5-mdg6");
		kitap5.setIsmi("zambak");
		kitap5.setId(0);
		
		KitapEvi kitapEvi1 = new KitapEvi(new Kitap("ddf5-mdg6", "zambak", 0), "KVektorel", "Kizilay");
		KitapEvi kitapEvi2 = new KitapEvi(kitap2, "KVektorel", "Kizilay");
	}

}
