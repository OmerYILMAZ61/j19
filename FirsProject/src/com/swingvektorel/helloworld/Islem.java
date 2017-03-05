package com.swingvektorel.helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Islem {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("benim pencerem");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jFrame.setLocation(1000, 100);
		jFrame.setSize(200, 200);

		jFrame.setLocationRelativeTo(null);// ortaya çýkarýr

		// JLabel jlLabel = new JLabel("hello world");
		// jFrame.add(jlLabel);
		JButton button = new JButton("týkla");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("týklandý");
			}
		});

		jFrame.add(button);

		jFrame.setVisible(true);

	}
}
