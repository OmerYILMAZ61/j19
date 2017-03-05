package com.vektorel2.generic;

public class Islem {

	public static void main(String[] args) {
//		ekranaBas("merhaba");
//		ekranaBas(10);
//		ekranaBas(10.0);
//		System.out.println(ekranaBas('a'));
		Person person = new Person();
		Animal hayvan = new Animal();
		ekranaBas(person);
		ekranaBas(hayvan);
		
	}
	//E her tip manasýna gelir !
	public static <E> E ekranaBas(E e){
		System.out.println(e);
//		e = (E) (e +"10");
		if(e instanceof Person){
			Person person = (Person) e;
			System.out.println(person.benimBilgilerim());
		}
		if(e instanceof Animal){
			Animal hayvan = (Animal) e;
			System.out.println(hayvan.benimBilgilerim());
		}
		return e ;
		
	}
}
