package com.vektörel.myex;

public class ArrayHatalari extends Exception {
	
	private String message;

	public ArrayHatalari(String message) {
		this.message = message;
	}

	public void arraySikintilari() {
		System.out.println("Array'de Hata Var"
				+ "\\");
	}

	public String getMessage() {
		
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
