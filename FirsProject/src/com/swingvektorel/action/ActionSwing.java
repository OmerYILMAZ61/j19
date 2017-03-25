package com.swingvektorel.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionSwing extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		System.out.println("merhaba dünya");
	}
	
	public ActionSwing() {

		MyAction myAction = new MyAction();
		JButton jButton = new JButton("git");
		jButton.addActionListener(myAction);
		jButton.addActionListener(this);
		jButton.setBounds(20, 20, 300, 300);
		add(jButton);
		
		setLayout(null);
		setSize(400, 400);
		setVisible(true);
	}

	

}
