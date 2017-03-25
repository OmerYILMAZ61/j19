package com.jdbc.hastane;

public class Saglik {

	public static void main(String[] args) {
		DAO dao = new DAO();
//		dao.getBilgileri("select * from pub.hastane");
//		dao.getBilgileri("select * from pub.doktor");
//		String SQL = "insert into pub.deneme (id,name) values (2,'çorum')";
//		dao.calistir(SQL);
		
		//dao.calistir("delete from pub.deneme where id = 1");
		dao.calistir("drop table pub.deneme");
		
	}
}
