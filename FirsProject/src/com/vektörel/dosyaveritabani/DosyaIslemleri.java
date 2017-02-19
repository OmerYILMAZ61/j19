package com.vektörel.dosyaveritabani;

import java.io.File;

public class DosyaIslemleri {

	public File DosyaBulucu(String dosyaIsmi, String path) {

		File file = new File(path);
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()) {
						if (files[i].getName().equals(dosyaIsmi)) {
							return files[i];
						}

					}

				}
			} 

		}
		return null;
	}
}
