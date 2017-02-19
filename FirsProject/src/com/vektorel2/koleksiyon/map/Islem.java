package com.vektorel2.koleksiyon.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Islem {

	public static void main(String[] args) {
		
		Map<Integer, String> myMapDolu = new HashMap<>();
//		myMap.put("1", "Ahmet");	//key aynýysa deðer deðiþir !
//		myMap.put("2", "Hasan");
//		myMap.put("3", "Mehmet");
//		System.out.println(myMap);
//		
//		System.out.println(myMap.entrySet());//veri kümesi içinde gezmek !
//		System.out.println(myMap.containsValue("Ahmet"));
//		System.out.println(myMap.get("2"));
		
		MyMap myMap = new MyMap();
		myMapDolu = myMap.veriEkle();
		//myMap.veriGoster();
		//System.out.println(myMapp);
		//System.out.println(myMap.veriEkle());
		myMap.veriGoster(myMapDolu);
		for (Entry en : myMapDolu.entrySet()) {
			if(en.getValue().equals("ahmet"))
				en.setValue("mehmet");
		}
		System.out.println(myMapDolu);
		//myMapDolu.put(1, "hasan");
				
	}
}
