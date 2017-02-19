package com.vektörel.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Yazici {

	public void yaz(File file,byte[] b){
		
		
		try {
			
			FileOutputStream ostream = new FileOutputStream(file,true);
			ostream.write(b, 0, 1);
			//ostream.write(b);
			
			ostream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
  	}
}
