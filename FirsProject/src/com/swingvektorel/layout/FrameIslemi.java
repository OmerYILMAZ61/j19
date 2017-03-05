package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.temporal.JulianFields;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameIslemi extends JFrame {

	CardLayout cardLayout;
	JPanel jPanel;
	JPanel jPanelGiris;
	JPanel jPanelEkran;
	
	public FrameIslemi() {

		setSize(400, 400);
		setLayout(new BorderLayout());
		setLocation(100, 200);
		
		anaGovdeOlustur();
		jPanelLoginiDoldur();
		jPanelShowDoldur();
		
	}

	public void anaGovdeOlustur()	{
		
		cardLayout = new CardLayout();
		
		jPanel = new JPanel(cardLayout);// paneli ayarlama

		jPanelGiris = new JPanel(new GridLayout(3, 3));// eklencek login
		
		jPanelEkran = new JPanel(new FlowLayout());
		
		jPanel.add(jPanelGiris, "login");// adlandýrma
		jPanel.add(jPanelEkran, "message");// adlandýrma

		add(jPanel, BorderLayout.CENTER);
	}
	
	public void jPanelLoginiDoldur(){
		jPanelGiris.add(new JLabel("adi"));
		JTextField textFieldad = new JTextField(15);
		jPanelGiris.add(textFieldad);

		jPanelGiris.add(new JLabel("soyadi"));
		JTextField textFieldsifre = new JTextField(15);
		jPanelGiris.add(textFieldsifre);

		jPanelGiris.add(new JLabel(""));

		JButton jButton1 = new JButton("giris");
		jPanelGiris.add(jButton1);
		
		jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanel, "message");

			}
		});
	}
	
	public void jPanelShowDoldur(){
		
		JLabel jLabelKarsilama = new JLabel("Hoþ Geldiniz");
		jPanelEkran.add(jLabelKarsilama);
		
		
	}
	
	

}
