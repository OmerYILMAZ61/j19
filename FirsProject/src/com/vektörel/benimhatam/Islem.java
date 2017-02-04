package com.vektörel.benimhatam;

public class Islem {

	public static void main(String[] args) {

		// try {
		// throw new NullPointerException();
		// }
		// catch (ArithmeticException e) {
		// System.out.println("mat hata");
		// } catch (Exception e) {
		// System.out.println("hoaydaa");
		// }
		// try {
		// throw new Exception("my message");
		// }
		// // catch (Exception e) {
		//
		// System.out.println(e.getMessage());
		// }
		// catch (ArithmeticException e) {
		// System.out.println("mat hata");
		// } catch (Exception e) {
		// System.out.println("hoaydaa");
		// }
		// finally {
		// System.out.println("hoaydaa");
		// }
		//
		try {
			hata();
		} catch (NullPointerException e) {
			System.out.println("hata var");
		}
		

	}

	public static void hata() throws NullPointerException {
		throw new NullPointerException();
	}

}
