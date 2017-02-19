package com.vektorel2.koleksiyon.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	Queue<String> kuyruk = new LinkedList<>();
	
	public void offer(String s) {
		kuyruk.offer(s);
	}

	public void poll() {
		if(!kuyruk.isEmpty())
		System.out.println(kuyruk.poll());
	}

	public void veriGoster() {
		Iterator<String> iterator = kuyruk.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
