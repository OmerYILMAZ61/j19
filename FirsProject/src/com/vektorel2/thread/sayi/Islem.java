package com.vektorel2.thread.sayi;

public class Islem {

	public static void main(String[] args) {
		Sayi1 sayi1 = new Sayi1();
		Sayi2 sayi2 = new Sayi2();
		
		Thread isParcacigi1 = new Thread(sayi1);
		Thread isParcacigi2 = new Thread(sayi2);
		//runtime thread üretimi
		Thread isparcacigi3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		isParcacigi1.start();
		isParcacigi2.start();
		
		synchronized (isParcacigi1) {
			
			try {
				isParcacigi1.wait();
				System.out.println("*-*-*-*-*-*-");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
