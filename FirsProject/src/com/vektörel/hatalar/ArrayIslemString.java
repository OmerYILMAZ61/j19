package com.vektörel.hatalar;

import java.util.Scanner;

public class ArrayIslemString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] diziStr = new String[3];
		//int i = 0;
		
	try{
		for(int i=0 ;i<10;i++){
				System.out.println(i+1 + ". deðeri gir");
				diziStr[i]=sc.nextLine();
	
				
			
			}
			
		}catch (Exception e) {
			System.out.println("hataya düþtün hata kodu: " );
			e.printStackTrace();
		}
		
		
	
		for(int j =0;j<diziStr.length;j++){
			System.out.println(diziStr[j]);
		}
	
		System.out.println("devam ");
	}
}
