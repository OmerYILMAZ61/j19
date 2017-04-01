package com.jdbc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.entity.Hastane;
import com.jdbc.entity.User;

public class UserDAO {

	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;

	public UserDAO() {
		try {
			connection = DriverManager.getConnection(ConnectionEnum.dBCon(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getBilgileri(String SQL) {

		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(rs.getString("isim"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void calistir(String SQL) {

		try {
			statement = connection.createStatement();
			if(!statement.execute(SQL)){
				System.out.println("iþlemi yaptým");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Hastane getHastane(int id){
		Hastane hastane = new Hastane();
		String SQL = "SELECT * FROM pub.hastane WHERE id = ?";
		try {
			//statement = connection.createStatement();
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				int idSQL = rs.getInt("id");
				String isimSQL = rs.getString("isim");
				hastane.setId(idSQL);
				hastane.setIsim(isimSQL);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hastane;
		
	}

	public boolean isUserControl(String username, String password) {
		User user = null;
		String SQL = "Select * from pub.users where username = ? and password = ?";
		try {
			preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return (user !=null);
	}

}
