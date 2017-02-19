package com.vektorel2.koleksiyon.stack;

import java.util.Stack;

public class Islem {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		Stack<String> stack = new Stack<>();

		String[] dizi = { "3", "4", "6", "7" };
		String[] dizi2 = { "6", "5", "4" };

		stack = myStack.pushFonksiyonu(dizi);
		System.out.println(stack);
		stack = myStack.popFonksiyonu(stack);
		System.out.println(stack);
		stack = myStack.pushFonksiyonu(dizi2);
		System.out.println(stack);
		myStack.veriGoster(stack);
	}
}
