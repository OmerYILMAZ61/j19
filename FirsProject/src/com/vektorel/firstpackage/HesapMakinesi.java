package com.vektorel.firstpackage;
//lang paketini import etmeye gerek yok ve ayný pakte içindeki classlarýda import etmeye gerek yok

import java.util.Scanner;

// ctrl+d satýrý sil
/* bi paketteki tüm classlarý kullancaksak;
import com.vektörel * kullan */

// ctrl+shift+o : kullanýlmayanlarý siler ve ya kullanýlmasý gerekeni ekler örn:import java.util.Scanner;
/*fonkisyon yazma kurallarý
1. eriþim belirleyiciler :   public
  							 private
 							 protected
                           * no-modifier/package-private                         önce bu 4 ünden birini seç,
2. dönecek deðerin türünü belirle eðer deðer döndürmiycekseb "void" kullan
3. fonksiyonun adý 
4. parametre deðeri girirken türünü belirterek gir
5. eðer deðer döndürceksen return kullan 
public int toplamaYap(int x,int y){
 (1)   (2)   (3)            (4)

return 0;
  (5)
}
metod imzasý topla(int a, intb) dir ayný isimde yeni metod oluþturcaksak parametre sayýsý deðiþmesi gerek örn topla(int a,int b,int c) gibi
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
		System.out.println("hangi iþlemi yapmak istiyorsun?");
		System.out.println("toplama için 1'i");
		System.out.println("çýkarma için 2'yi");
		System.out.println("çarpma için 3'ü");
		System.out.println("bölme için 4'ü seçiniz");

		int secim;
		do {
			secim = sc.nextInt();
			if (secim < 1 || secim > 4) {
				System.out.println("dogru bir deðer giriniz");
			}
		} while (secim < 1 || secim > 4);

		System.out.println("1. sayýyý giriniz");
		float rakam1 = sc.nextFloat();

		System.out.println("2. sayýyý giriniz");
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

		System.out.print("iþlemin sonucu " + sonuc);
		sc.close();

	}

}
