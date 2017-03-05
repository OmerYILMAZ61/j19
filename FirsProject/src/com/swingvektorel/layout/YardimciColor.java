package com.swingvektorel.layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class YardimciColor extends JFrame {

	public YardimciColor() {
		setLayout(null);
		Color color = new Color(200,0, 0);
		JButton jButton = new JButton("bas");
		jButton.setBackground(color);
		jButton.setBounds(20, 20, 100, 100);
		setLocation(1200, 500);
		add(jButton);
		
	
	}
}
