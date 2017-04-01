package com.jdbc.hastane2;

public enum ConnectionEnum {

	HOST(1,"ec2-54-243-185-99.compute-1.amazonaws.com"),
	PORT(2,"5432"),
	DBNAME(3,"d2fpqk5s7dkvjc?sslmode=require"),//?den sonrasý heroku için gerekli !
	USERNAME(4,"xdneizhsfqqtaz"),
	PASSWORD(5,"c5fbc482c3f4c57dd905a15e970b4b2604af26595d186eeeed7d53b7f0f46b40"),
	JDBC_STRING(6,"jdbc:postgresql://");
	
	int id;
	String value;
	
	ConnectionEnum(int id, String value) {
		this.id=id;
		this.value=value;
		}
	
	public int getId() {
		return id;
	}
	
	public String getValue() {
		return value;
	}
	
	static String dBCon(){
		return ConnectionEnum.JDBC_STRING.getValue()+ConnectionEnum.HOST.getValue()+":"
				+ConnectionEnum.PORT.getValue()+"/"+ConnectionEnum.DBNAME.getValue();
	}
	
	
	
}
