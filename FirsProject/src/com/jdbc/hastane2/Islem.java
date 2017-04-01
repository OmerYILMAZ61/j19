package com.jdbc.hastane2;

public class Islem {

	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.getBilgileri("Select * From pub.hastane");
	}
}
