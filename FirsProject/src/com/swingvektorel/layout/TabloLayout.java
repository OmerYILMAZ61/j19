package com.swingvektorel.layout;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TabloLayout extends JFrame {

	public TabloLayout() {
		setLocation(200, 100);
		GridLayout gridLayout = new GridLayout(2, 2);
		//önemli!!!!! ayarlamayý yapar
		
		setLayout(gridLayout);
		
		add(new JLabel("adi"));
		add(new JTextField(15));
		
		add(new JLabel("soyadi"));
		add(new JTextField(15));
		
		
		
	}
}
