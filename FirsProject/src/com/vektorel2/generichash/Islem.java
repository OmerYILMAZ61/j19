package com.vektorel2.generichash;

import java.util.ArrayList;
import java.util.List;

import com.vektorel2.generic2.Person;

public class Islem {

	public static void main(String[] args) {
		
		MyHashMap<Integer,	String> myHash = new MyHashMap<>();
		
		String[] a = {"ömer","asd","das"};
		
		myHash.put(1,a);
		
		myHash.yaz();
		
		MyHashMap<String,	Person> myHash2 = new MyHashMap<>();
		
		Person[] person = new Person[2];
		
		myHash2.put("1", person);
		
		MyHashMap<String, Person>[] myHash3 = new MyHashMap[5];
		
		List<MyHashMap<String, Person>> myHash4= new ArrayList<>();
		
		
	}
}
