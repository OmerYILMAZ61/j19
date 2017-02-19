package com.vektorel2.koleksiyon.queue;

//import java.util.LinkedList;
//import java.util.Queue;

public class Islem {

	public static void main(String[] args) {
		
//		Queue<String> kuyruk = new LinkedList<>();
//		kuyruk.offer("1"); //push
//		kuyruk.offer("2"); //push
//		kuyruk.offer("3"); //push
//		System.out.println(kuyruk.peek());
//		System.out.println(kuyruk);
//		System.out.println(kuyruk.poll());//pop fakat ilk elemaný yollar !
//		System.out.println(kuyruk);
//		kuyruk.peek();//peek fakat ilk elemaný çevirir !
		
		MyQueue myQueue = new MyQueue();
		
		myQueue.offer("1");
		myQueue.offer("2");
		myQueue.offer("3");
		myQueue.offer("4");
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myQueue.veriGoster();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myQueue.poll();
		myQueue.poll();
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		myQueue.veriGoster();
	}
}
