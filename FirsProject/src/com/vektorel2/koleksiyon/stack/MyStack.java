package com.vektorel2.koleksiyon.stack;

import java.util.Enumeration;
import java.util.Stack;

public class MyStack {
	Stack<String> stack = new Stack<>();

	public Stack<String> pushFonksiyonu(String[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			stack.push(dizi[i]);
		}
		return stack;
	}

	public Stack<String> popFonksiyonu(Stack<String> stack2) {
		System.out.println("pop edilen veri " + stack2.pop());
		System.out.println("pop edilen veri " + stack2.pop());
		return stack2;
	}

	public void veriGoster(Stack<String> stack2) {
		Enumeration<String> enuStack = stack2.elements();

		while (enuStack.hasMoreElements()) {
			System.out.println(enuStack.nextElement());
		}
	}

}
