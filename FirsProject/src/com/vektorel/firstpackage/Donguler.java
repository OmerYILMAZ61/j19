package com.vektorel.firstpackage;

import java.util.Scanner;

public class Donguler {
	
		
	
	public static void main(String[] args) {
			 
		Scanner sc = new Scanner(System.in);
		String[] a = new String[10]; 
		System.out.println("10 tane eleman giriniz");
		for (int i =0 ; i<a.length;i++){
			System.out.println((i+1) + ". eleman giriniz");
			a[i] = oku();
		}
		for (int i = 0;i<a.length;i++){
			System.out.println(a[i]);
		
		}
		}
	
	private static String oku(){
		Scanner scan = new Scanner(System.in );
		return scan.nextLine();
		
	}
	
	
	}

