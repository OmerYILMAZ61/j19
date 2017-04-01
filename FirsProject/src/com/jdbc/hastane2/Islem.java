package com.jdbc.hastane2;

import com.jdbc.entity.Hastane;

public class Islem {

	public static void main(String[] args) {
		DAO dao = new DAO();
//		dao.getBilgileri("Select * From pub.hastane");
//	
//		dao.calistir("insert into pub.hastane (isim) values ('Gölbasi devlet')");
//		dao.getBilgileri("Select * From pub.hastane");
	
		Hastane hastane = dao.getHastane(2);
		System.out.println(hastane.getId());
		System.out.println(hastane.getIsim());

		
		
	}
}
