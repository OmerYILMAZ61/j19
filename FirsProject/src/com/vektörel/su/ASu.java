package com.vektörel.su;

public abstract class ASu implements IBalikTutmak {

	public void akar(){
		System.out.println("Su Akar Yolunu Bulur");
	}
	
	public abstract int debi();
	
	public void tuzlulukOraný(){
		System.out.println(0 + " Tuz Oraný");
	}
	
	
}
