package com.vekt�rel.Insan;

public class Islem {
	public static void main(String[] args) {

		IInsan insan2 = new Insan();

		insan2.dusunme();

		// insan2.karaciger(); insan 2 aray�z olarak tan�mland���ndan class�n
		// fonksiyonlar�n� �al��t�rmaz

		IInsan insan = new IInsan() {

			@Override
			public void tatmak() {
				// TODO Auto-generated method stub
				System.out.println("tatma");
			}

			@Override
			public void koklama() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hissetmek() {
				// TODO Auto-generated method stub

			}

			@Override
			public void gormek(String value) {
				// TODO Auto-generated method stub

			}

			@Override
			public void duymak(String name) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dusunme() {
				// TODO Auto-generated method stub

			}
		};
		insan.tatmak();
	}
}
