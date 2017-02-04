package com.vektörel.array1;

import java.util.Scanner;

public class Pars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] diz = new int[3];
		
		try{
		for(int i = 0 ; i<diz.length;i++){
			System.out.println((i+1) + ". Deðeri Girin");
			diz[0] = Integer.valueOf(sc.nextLine());
		}
		}
		catch (NumberFormatException e) {
			System.out.println("hata " + e);
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("çalýþ ");
			sc.close();
		
		}
	
	
	}
}
