package com.swingvektorel.layout;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ikon extends JFrame {

	public Ikon() {
		
		ImageIcon icon = new ImageIcon(getClass().getResource("/1.png"));
		add(new JButton(icon));
	
	}
}
