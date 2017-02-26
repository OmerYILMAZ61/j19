package com.vektorel2.thread.is;

public class Ikinci implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 200) {
			if(i%50==50){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("***");
			i++;
		}
	}

}
