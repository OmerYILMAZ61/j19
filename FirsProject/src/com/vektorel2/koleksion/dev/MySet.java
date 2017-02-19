package com.vektorel2.koleksion.dev;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	Scanner sc;

	public Set<String> veriGir() {
		this.sc = new Scanner(System.in);
		Set<String> veri = new HashSet<String>();
		for (;;) {
			String s = sc.nextLine();
			if (s.equalsIgnoreCase(("exit"))) {
				break;
			}
			if(veri.add(s))
				System.out.println("veri ekledim");
			else
				System.out.println("hoaydaaaa");
		}
		
		return veri;
	}

	public Set<String> linkedVeriGir() {
		this.sc = new Scanner(System.in);
		Set<String> veri = new LinkedHashSet<String>();
		for (;;) {
			String s = sc.nextLine();
			if (s.equalsIgnoreCase(("exit"))) {
				break;
			}
			if(veri.add(s))
				System.out.println("veri ekledim");
			else
				System.out.println("hoaydaaaa");
		}
		
		return veri;
	}

	public Set<String> TreeVeriGir() {
		this.sc = new Scanner(System.in);
		Set<String> veri = new TreeSet<String>();
		for (;;) {
			String s = sc.nextLine();
			if (s.equalsIgnoreCase(("exit"))) {
				break;
			}
			if(veri.add(s))
				System.out.println("veri ekledim");
			else
				System.out.println("hoaydaaaa");
		}
		
		return veri;
	}
	
	public void veriOku(Set<String> veri) {
		Iterator<String> iterator = veri.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
