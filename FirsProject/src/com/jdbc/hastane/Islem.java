package com.jdbc.hastane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Islem {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public void getHastaneSonuclari(String SQL){
		try {
			Connection connection = DriverManager.getConnection(ConnectionEnum.dBCon(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());

			String SQL1 = "select * from pub.hastane";

			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(SQL1);

			while (rs.next()) {
				System.out.println(rs.getString("isim"));

			}

			String SQL2 = "insert into pub.hastane (isim) values ('dis kapi')";
			
			if (statement.executeUpdate(SQL2)>0) {
				System.out.println("verileri ekledim");
			}
			
			rs = statement.executeQuery(SQL1);
			
			while (rs.next()) {
				System.out.println(rs.getString("isim"));
			}
			
			

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		

	}
}
