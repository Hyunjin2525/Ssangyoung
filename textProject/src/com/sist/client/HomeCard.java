package com.sist.client;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.manager.MelonMusicHomeVO;

public class HomeCard extends JPanel {
	JLabel poLa = new JLabel();
	JLabel tLa = new JLabel();

	public HomeCard(MelonMusicHomeVO vo) {
		setLayout(null);
		poLa.setBounds(5,5,280,300);
		tLa.setBounds(5, 310, 275, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url = new URL(vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 280, 300);
			
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
