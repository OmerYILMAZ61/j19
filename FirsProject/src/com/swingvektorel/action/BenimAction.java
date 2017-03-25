package com.swingvektorel.action;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BenimAction extends JFrame implements ActionListener{

	JButton jButton; 
	JTextField jTextField; 
	String mytext = "";
	JTextArea JTextArea;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		mytext +="\n" + jTextField.getText();
		JTextArea.setText(mytext);
		
	}
	
	public BenimAction() {

		setLayout(new FlowLayout());
		setSize(500, 500);
		jButton = new JButton("gönder");
		JTextArea = new JTextArea(10,10);
		jTextField = new JTextField(15);
		add(jTextField);
		add(jButton);
		add(JTextArea);
		jButton.addActionListener(this);
		jButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("key");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("key");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		setVisible(true);
		
		
		
		
	}

	
	
	
	
	
	
	
}
