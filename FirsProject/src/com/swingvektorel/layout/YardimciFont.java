package com.swingvektorel.layout;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class YardimciFont extends JFrame {

	public YardimciFont() {
		setLayout(null);
		Font font = new Font("arial", Font.ITALIC, 10);
		JLabel jLabel = new JLabel("merhaba dünya");
		jLabel.setSize(200, 50);
		jLabel.setFont(font);
		add(jLabel);
		
		
	}
}
