package com.swingvektorel.dosyaokuyucu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class JFile extends JFrame implements ActionListener {

	JPanel jPanelFileOkuyucu;
	JPanel jPanelFileYazici;
	JFileChooser fileChooser;
	JButton jButton;
	JTextArea jTextArea;
	
	public JFile() {
		
		setLayout(new BorderLayout());
		panelOlustur();
		okuyucuyuDoldur();
		yaziciDoldur();
	}

	public void panelOlustur() {
		jPanelFileOkuyucu = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jPanelFileYazici = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		add(jPanelFileOkuyucu,BorderLayout.NORTH);
		add(jPanelFileYazici,BorderLayout.CENTER);
	}

	public void okuyucuyuDoldur(){
		
		jButton = new JButton("gir");
		jButton.addActionListener(this);
		JButton jButtonKapat = new JButton("kapat");
		jButtonKapat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				Geçiþ geçiþ = new Geçiþ();
			}
		});
		jPanelFileOkuyucu.add(jButtonKapat);
		jPanelFileOkuyucu.add(jButton);
	}
	
	public void yaziciDoldur(){
		jTextArea = new JTextArea(20,30);
		jTextArea.setAutoscrolls(true);
		jPanelFileYazici.add(jTextArea);
//		fileChooser = new JFileChooser();
//		jPanelFileYazici.add(fileChooser);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			File myFile = fileChooser.getSelectedFile();
			Okuyucu okuyucu = new Okuyucu();
			String veri = okuyucu.dosyaOku(myFile);
			jTextArea.setText(veri);
		}
		
	}
}
