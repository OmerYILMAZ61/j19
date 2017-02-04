package com.vektorel.firstpackage;
//lang paketini import etmeye gerek yok ve ayn� pakte i�indeki classlar�da import etmeye gerek yok

import java.util.Scanner;

// ctrl+d sat�r� sil
/* bi paketteki t�m classlar� kullancaksak;
import com.vekt�rel * kullan */

// ctrl+shift+o : kullan�lmayanlar� siler ve ya kullan�lmas� gerekeni ekler �rn:import java.util.Scanner;
/*fonkisyon yazma kurallar�
1. eri�im belirleyiciler :   public
  							 private
 							 protected
                           * no-modifier/package-private                         �nce bu 4 �nden birini se�,
2. d�necek de�erin t�r�n� belirle e�er de�er d�nd�rmiycekseb "void" kullan
3. fonksiyonun ad� 
4. parametre de�eri girirken t�r�n� belirterek gir
5. e�er de�er d�nd�rceksen return kullan 
public int toplamaYap(int x,int y){
 (1)   (2)   (3)            (4)

return 0;
  (5)
}
metod imzas� topla(int a, intb) dir ayn� isimde yeni metod olu�turcaksak parametre say�s� de�i�mesi gerek �rn topla(int a,int b,int c) gibi
*/
public class HesapMakinesi {

	public int sayi1 = 5;

	public float topla(float deger1, float deger2) {

		return deger1 + deger2;
	}

	public float cikart(float deger1, float deger2) {

		return deger1 - deger2;
	}

	public float carp(float deger1, float deger2) {

		return deger1 * deger2;
	}

	public float bol(float deger1, float deger2) {

		return deger1 / deger2;
	}

	public static void main(String[] args) {

		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		float sonuc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("hangi i�lemi yapmak istiyorsun?");
		System.out.println("toplama i�in 1'i");
		System.out.println("��karma i�in 2'yi");
		System.out.println("�arpma i�in 3'�");
		System.out.println("b�lme i�in 4'� se�iniz");

		int secim;
		do {
			secim = sc.nextInt();
			if (secim < 1 || secim > 4) {
				System.out.println("dogru bir de�er giriniz");
			}
		} while (secim < 1 || secim > 4);

		System.out.println("1. say�y� giriniz");
		float rakam1 = sc.nextFloat();

		System.out.println("2. say�y� giriniz");
		float rakam2 = sc.nextFloat();

		switch (secim) {
		case 1:
			sonuc = hesapMakinesi.topla(rakam1, rakam2);
			break;
		case 2:
			sonuc = hesapMakinesi.cikart(rakam1, rakam2);
			break;
		case 3:
			sonuc = hesapMakinesi.carp(rakam1, rakam2);
			break;
		case 4:
			sonuc = hesapMakinesi.bol(rakam1, rakam2);
			break;
		default:
			break;
		}

		System.out.print("i�lemin sonucu " + sonuc);
		sc.close();

	}

}
