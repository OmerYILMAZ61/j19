package com.vektorel2.koleksiyon.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackSinifi {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");

		Enumeration array = stack.elements();

//		while (array.hasMoreElements()) {
//			System.out.println(array.nextElement());
//		}

		System.out.println("*-*-*-*-*-*-*-*");
		System.out.println(stack.isEmpty());
		//System.out.println(stack.peek()); // son elemnt alma
		
		System.out.println("*-*-*-*-*-*-*-* + size");
		int stackSize = stack.size();
		for (int i = 0; i < stackSize; i++) {
			System.out.println(stack.pop());
		}
		System.out.println("*-*-*-*-*-*-*-* - size");
		
		
		System.out.println("*-*-*-*-*-*-*-*");
		while(!stack.isEmpty()){
		System.out.println("pop edilen nesne " + stack.pop());
		System.out.println("pop edilen nesne " + stack.pop());
		}
		System.out.println("*-*-*-*-*-*-*-*");
		
		
		//System.out.println(stack.peek());
		System.out.println("*-*-*-*-*-*-*-*");
		Enumeration array2 = stack.elements();
		while (array2.hasMoreElements()) {
			System.out.println(array2.nextElement());

		}

	}
}
