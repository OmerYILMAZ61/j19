package com.swingvektorel.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HizalamaLayout extends JFrame {

	public HizalamaLayout() {
		setLocation(1400,100);
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		add(new JLabel("do�u"),borderLayout.EAST);
		add(new JLabel("kuzey"),borderLayout.NORTH);
		add(new JLabel("g�ney"),borderLayout.SOUTH);
		add(new JLabel("bat�"),borderLayout.WEST);
		add(new JLabel("merkez"),borderLayout.CENTER);
		
		
	}
}
