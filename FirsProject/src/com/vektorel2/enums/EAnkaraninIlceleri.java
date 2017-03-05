package com.vektorel2.enums;

public enum EAnkaraninIlceleri {
	
	
	CANKAYA(1,"�ankaya"),
	MAMAK(2,"Mamak"),
	KE��OREN(3,"Kecioren");
	
	int key;
	String value ;
	
	private EAnkaraninIlceleri(int key,String value) {
		this.key = key;
		this.value=value ;
		
	}
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	
	
}
