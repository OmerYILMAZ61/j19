package com.vektorel2.thread.is;

public class Islem {

	public static void main(String[] args) {
		Ikinci ikinci = new Ikinci();
		Thread is1 = new Thread(ikinci);
		Thread is2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i =0;
				while (i < 200) {
					if(i%25==0){
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("###" +i);
					i++;
				}
				
			}
		});
		
		is1.start();
		is2.start();
		
		
		
		
		
		
		
		
	}
	
}
