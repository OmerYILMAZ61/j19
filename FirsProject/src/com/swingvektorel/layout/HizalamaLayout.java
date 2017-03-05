package com.swingvektorel.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HizalamaLayout extends JFrame {

	public HizalamaLayout() {
		setLocation(1400,100);
		BorderLayout borderLayout = new BorderLayout();
		setLayout(borderLayout);
		add(new JLabel("doðu"),borderLayout.EAST);
		add(new JLabel("kuzey"),borderLayout.NORTH);
		add(new JLabel("güney"),borderLayout.SOUTH);
		add(new JLabel("batý"),borderLayout.WEST);
		add(new JLabel("merkez"),borderLayout.CENTER);
		
		
	}
}
