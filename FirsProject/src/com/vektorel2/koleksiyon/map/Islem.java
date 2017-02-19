package com.vektorel2.koleksiyon.map;


import java.util.HashMap;
import java.util.Map;

public class Islem {

	public static void main(String[] args) {
		
		Map<Integer, String> myMapp = new HashMap<>();
//		myMap.put("1", "Ahmet");	//key aynýysa deðer deðiþir !
//		myMap.put("2", "Hasan");
//		myMap.put("3", "Mehmet");
//		System.out.println(myMap);
//		
//		System.out.println(myMap.entrySet());//veri kümesi içinde gezmek !
//		System.out.println(myMap.containsValue("Ahmet"));
//		System.out.println(myMap.get("2"));
		
		MyMap myMap = new MyMap();
		myMapp = myMap.veriEkle();
		//myMap.veriGoster();
		//System.out.println(myMapp);
		//System.out.println(myMap.veriEkle());
		myMap.veriGoster(myMapp);
	}
}
