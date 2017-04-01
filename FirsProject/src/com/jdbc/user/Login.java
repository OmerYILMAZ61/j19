package com.jdbc.user;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Username");
		String username = sc.next();
		System.out.println("Password");
		String password = sc.next();

		UserDAO userDAO = new UserDAO();
		if (userDAO.isUserControl(username, password)) {
			System.out.println("giriþ baþarýlý");
		}

	}
}
