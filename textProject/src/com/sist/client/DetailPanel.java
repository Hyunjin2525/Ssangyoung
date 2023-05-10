package com.sist.client;
import java.util.*;

import com.sist.manager.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DetailPanel extends JPanel implements ActionListener{
	JLabel imgLa;
	JLabel la1,la2,la3,la4;
	JButton b;
	JLabel subtitleLa, titleLa, singerLa, dateLa;
	ControlPanel cp;
	
	
	public DetailPanel(ControlPanel cp) {
		this.cp=cp;
		imgLa = new JLabel();
		la1 = new JLabel("카테고리");
		la2 = new JLabel("앨범명");
		la3 = new JLabel("가수명");
		la4 = new JLabel("발매일");
		b = new JButton("목록");
		subtitleLa = new JLabel("");
		titleLa = new JLabel("");
		singerLa = new JLabel("");
		dateLa = new JLabel("");
		
		setLayout(null);
		imgLa.setBounds(100, 15, 400, 400);
		
		la1.setBounds(100, 430, 60, 40);
		subtitleLa.setBounds(165, 430, 300, 40);

		la2.setBounds(100, 480, 60, 40);
		titleLa.setBounds(165, 480, 300, 40);

		la3.setBounds(100, 530, 60, 40);
		singerLa.setBounds(165, 530, 300, 40);

		la4.setBounds(100, 580, 60, 40);
		dateLa.setBounds(165, 580, 300, 40);

		b.setBounds(250, 670, 100, 40);
		
		//윈도우에 추가
		add(imgLa);
		add(la1);add(subtitleLa);
		add(la2);add(titleLa);
		add(la3);add(singerLa);
		add(la4);add(dateLa);
		add(b);
		
		b.addActionListener(this);
		
		
	}

	//"C:\Program Files\Google\Chrome\Application\chrome.exe"
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			cp.card.show(cp, "home");
		} 
	}
}
