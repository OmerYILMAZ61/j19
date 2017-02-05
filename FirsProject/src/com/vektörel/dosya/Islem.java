package com.vektörel.dosya;
/**
 * Byte Tabanlý							||		  	Karakter Tabanlý
 *		InputStream						||				Reader
 * 			FileInputStream				||					BufferedReader
 * 			ByteArrayInputStream		||					InputStreamReader
 *			FilterInputStream			||					StringReader
 *										||
 *		OutPutStream					||				Writer
 *			FileOutStream				||					BufferedWriter
 * 			ByteArrayOutStream			||					OutputStreamWriter
 *			FilterOutStream				||					StringWriter
 *										||				 	PrintWriter
 */	


public class Islem {

	public static void main(String[] args) {
		Yazici yaz = new Yazici();
		yaz.dosyaAc();
	
		Person per1 = new Person(1,"a");
		Person per2 = new Person(2,"b");
		Person per3 = new Person(3,"c");
	
		yaz.veriEkle(per1);
		yaz.veriEkle(per2);
		yaz.veriEkle(per3);
		
		yaz.dosyaKapa();
	
		Okuyucu oku  = new Okuyucu();
		oku.dosyaAc();
	}
	
	
	
}
