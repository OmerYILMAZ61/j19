package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KartLayout extends JFrame {

	public KartLayout() {
		setSize(400, 400);
		setLayout(new BorderLayout());
		//show için deðiþiklik için
		CardLayout cardLayout = new CardLayout();
		
		JPanel jPanelButton = new JPanel(new FlowLayout());
		
		JButton jButton1 = new JButton("button1");
		JButton jButton2 = new JButton("button2");
		
		jPanelButton.add(jButton1);
		jPanelButton.add(jButton2,0);//0 ilk eklenen olmasýný saðlar
		
		JPanel jPanelGoster = new JPanel(cardLayout);
		jPanelGoster.add(new JLabel("birinci label"),"label1");
		
		jPanelGoster.add(new JLabel("ikinci label"),"label2");
		
		add(jPanelButton,BorderLayout.NORTH);
		add(jPanelGoster, BorderLayout.CENTER);
		
		
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelGoster, "label1");
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelGoster, "label2");
			}
		});
		
		
		setVisible(true);
		
		
	
	
	
	}
	
}
