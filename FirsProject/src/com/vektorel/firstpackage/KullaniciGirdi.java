package com.vektorel.firstpackage;

import java.util.Scanner;

public class KullaniciGirdi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		/*
		System.out.println("adýnýz?");
		String ad =   scanner.nextLine();
		
		System.out.println("soyadýnýz?");
		String soyad =   scanner.nextLine();
		
		System.out.println("meslek?");
		String meslek =   scanner.nextLine();
		
		System.out.println("cinsiyet?");
		String cinsiyet =   scanner.nextLine();
		
		System.out.println("yaþýnýz?");
		int yas = scanner.nextInt();                   // next inti nextlinedan sonra kullan
		System.out.println( + yas);
		
		System.out.println(ad+ "\n" + soyad+" \n" + meslek +"\n"+ cinsiyet );
		*/
		
		System.out.println("kaç rakam toplamak istiyorsun?");
		int rakam = scanner.nextInt();
		int a =0;
		
		for (int i=0; i < rakam; i++)
		{
			
			System.out.println((i+1)+".rakamý giriniz" );
			a += scanner.nextInt();	
		}
		System.out.println("rakamlarýn toplamý "+a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
