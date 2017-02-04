package com.vektörel.banka;

public class Islem {

	public static void main(String[] args) {
		Tl tl = new Tl();
		tl.setMiktar(100);
		tl.setSeriNo("abc");
		tl.setFolyoBarkod("tttt");

		Dolar dolar = new Dolar();
		dolar.setSeriNo("cba");
		dolar.setMiktar(400);
		dolar.setCipNo("dddd");

		Banka banka = new Banka(new Tl("asdsa", 1993, "aaaaa"), dolar);

		// banka.setTl(new Tl("asdsa", 990, "aaaaa"));
		// System.out.println(a);
		// System.out.println( banka.getTl().getMiktar());
		// banka.getTl().setMiktar(100);
		//
		// Double b = banka.getTl().getMiktar();
		// System.out.println(b);

		System.out.println("Dolarýn seri nosu");
		System.out.println(banka.getDolar().getSeriNo());

		System.out.println("Tl seri no");
		System.out.println(banka.getTl().getSeriNo());

		dolar.setSeriNo("G700 - yeni seri no");

		System.out.println("Dolarýn seri nosu");
		System.out.println(banka.getDolar().getSeriNo());

	}
}
