package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BenimPaneller extends JFrame {
	public BenimPaneller() {
		JPanel ana = new JPanel(new BorderLayout());
		JPanel menü = new JPanel(new GridLayout(3, 1, 10, 10));

		menü.add(new JButton("1"));
		menü.add(new JButton("2"));
		menü.add(new JButton("3"));

		ana.add(menü, BorderLayout.WEST);

		JPanel area = new JPanel(new FlowLayout());
		area.add(new JTextArea(10,10));
		ana.add(area, BorderLayout.CENTER);

		add(ana);

	}
}
