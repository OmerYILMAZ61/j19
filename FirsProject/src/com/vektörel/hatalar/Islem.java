package com.vektörel.hatalar;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("deðer gir");
		int a = 0;
		int b;
		int c;
		
		
		try{
			b=sc.nextInt();
			c=sc.nextInt();
			a=b/c;
			
		}catch (Exception e) {
			System.out.println("hata var");
			e.printStackTrace();
		}
		
		System.out.println("sonuc " + a);
	}
}
