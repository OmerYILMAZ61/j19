package com.vektorel2.koleksiyon.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MyMap {
	Scanner sc;
	Map<Integer,String> map = new HashMap<>();
	
	public Map<Integer, String> veriEkle(){
	String value;
	int key ;
	sc = new Scanner(System.in);
	while (true) {
		System.out.println("key giriniz");
		key = sc.nextInt();
		if(key==0){
			break;
		}
		
		System.out.println("value giriniz");
		value = sc.next();
	map.put(key, value);
		
	}
	sc.close();
	return map;
	}
	
	public void veriGoster(Map<Integer, String> map){
		map.entrySet();
		
//		for (Entry<Integer, String> veri : map.entrySet()){
//			System.out.println(veri.getKey());
//			System.out.println(veri.getValue());
//			
//		}
		
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext());
		Entry en = (Entry)it.next();
		System.out.println(en.getKey());
		System.out.println(en.getValue());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
