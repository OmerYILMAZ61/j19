package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Paneller extends JFrame {

	public Paneller() {
		JPanel merkezi = new JPanel(new BorderLayout());
		JPanel jPanelButtonlar = new JPanel(new FlowLayout());
		
		JButton jButton=new JButton("1");
		
		jButton.setText("omer");
		
		jPanelButtonlar.add(jButton);
		jPanelButtonlar.add(new JButton("2"));
		
		
		merkezi.add(jPanelButtonlar,BorderLayout.NORTH);
		JPanel altPanel = new JPanel(new GridLayout(2, 2));
		
		altPanel.add(new JLabel("adi"));
		altPanel.add(new JTextField(15));
		
		altPanel.add(new JLabel("soyadi"));
		altPanel.add(new JTextField(15));
		
		
		merkezi.add(altPanel,BorderLayout.SOUTH);
		add(merkezi);
		
		
	}

}
