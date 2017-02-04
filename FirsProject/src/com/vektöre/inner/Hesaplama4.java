package com.vekt�re.inner;

public class Hesaplama4 {

	protected int sabit;
	private int ozelSabit;
	
	protected void ekranaBas(){
		System.out.println("Ekrana bas");
	}
	
	public static void main(String[] args) {
		
		
		Toplama4 toplama = new Toplama4();
		Cikartma4 cikarma = new Hesaplama4().new Cikartma4();
		
		
		cikarma.ekranaBas();
		toplama.ekranaBas();
		
		System.out.println("��karma yapt�m " + cikarma.cikarmaYap(20, 10));
		System.out.println("toplama yapt�m " + toplama.toplamaYap(10, 20));
		
		
	}
	
	
	public static class Toplama4 extends Hesaplama4{
		static int toplam;
		int sonuc ;
		
		protected int toplamaYap(int i, int j){
			return i+j;
		}
		
	}

	public class Cikartma4 extends Hesaplama4{
		int sonuc;
		
		protected int cikarmaYap(int i, int j){
			return i-j;
		}
	}
	
	


}
