package com.swingvektorel.login;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.swingvektorel.layout.Kisi;

public class FrameIslemi extends JFrame {

	CardLayout cardLayout;
	JPanel jPanel;
	JPanel jPanelGiris;
	JPanel jPanelEkran;
	private JTextField jtextFieldad;
	private JTextField jtextFieldsifre;
	private JButton jButton1;
	JPanel jPanel404;

	JLabel jLabelKarsilama;
	
	int sayac = 5;
	Timer timer ;
	
	public FrameIslemi() {

		setSize(400, 400);
		setLayout(new BorderLayout());
		setLocation(100, 200);

		anaGovdeOlustur();
		jPanelLoginiDoldur();
		jPanelShowDoldur();
		loginControl();
		jPanel404Doldur();

	}

	public void anaGovdeOlustur() {

		cardLayout = new CardLayout();

		jPanel = new JPanel(cardLayout);// paneli ayarlama

		jPanelGiris = new JPanel(new GridLayout(3, 3));// eklencek login

		jPanelEkran = new JPanel(new FlowLayout());
		
		jPanel404 = new JPanel(new FlowLayout());
		
		jPanel.add(jPanelGiris, "login");// adlandýrma
		jPanel.add(jPanelEkran, "message");// adlandýrma
		jPanel.add(jPanel404,"404");
		
		add(jPanel, BorderLayout.CENTER);
	}
	public void jPanel404Doldur(){
		JButton jButtonGeri = new JButton("geri");
		jButtonGeri.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanel, "login");
			}
		});
		JLabel jLabelGeri = new JLabel("yanlýþlýk var");
		jPanel404.add(jLabelGeri);
		jPanel404.add(jButtonGeri);
		
	}

	public void jPanelLoginiDoldur() {
		jPanelGiris.add(new JLabel("adi"));
		jtextFieldad = new JTextField(15);
		jPanelGiris.add(jtextFieldad);

		jPanelGiris.add(new JLabel("soyadi"));
		jtextFieldsifre = new JTextField(15);
		jPanelGiris.add(jtextFieldsifre);

		jPanelGiris.add(new JLabel(""));

		jButton1 = new JButton("giris");
		jPanelGiris.add(jButton1);

	}

	public void loginControl() {
//		ActionListener action = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(sayac == 0 ){
//					timer.stop();
//				}else{
//					sayac--;
//				}
//			}
//		};
		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Kisi kisi = new Kisi();
				if (jtextFieldad.getText().equals(kisi.getKullaniciAdi())
						&& jtextFieldsifre.getText().equals(kisi.getSifre())) {
					jLabelKarsilama.setText("Hoþ Geldiniz " + kisi.getKullaniciAdi());
					cardLayout.show(jPanel, "message");
				} else {
//					jLabelKarsilama.setText("kullanýcý adý ve ya þifre yanlýþ");
//					cardLayout.show(jPanel, "message");
					cardLayout.show(jPanel, "404");
					//JOptionPane.showMessageDialog(jPanel, "hata");
//					sayac = 5;
//					timer = new Timer(100, action);
//					timer.start();
					
				}
			}
		});
	}

	public void jPanelShowDoldur() {

		jLabelKarsilama = new JLabel("Hoþ Geldin");
		jPanelEkran.add(jLabelKarsilama);

	}

}
