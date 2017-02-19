package com.vektörel.file;

import java.io.File;
import java.io.IOException;

public class DosyaIslemleri {

	public DosyaIslemleri(String path) {
		File file = new File(path);
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if(files[i].isFile()){
						System.out.println(files[i].getName());
					}
				}
			} else if (file.isFile()) {

				System.out.println(file.getName());
				file.delete();
			}
		} else {
			String[] array = path.split("\\.");
			if (array.length > 1) {
				try {
					file.createNewFile();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				
				file.mkdir();
				
			}
		}

	}
}
