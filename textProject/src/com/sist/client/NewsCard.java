package com.sist.client;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class NewsCard extends JPanel {

	JLabel titleLa;
	JTextPane contentTa;
	JLabel dateLa;
	
	public NewsCard()
	{
		// 초기화
		setLayout(null);
		titleLa = new JLabel("");
		contentTa = new JTextPane();
		contentTa.setEnabled(false);
		JScrollPane js = new JScrollPane(contentTa);
		dateLa = new JLabel("");
		
		// 배치
		
		titleLa.setBounds(10, 30, 680, 30);
		js.setBounds(10, 62, 820, 70);
		dateLa.setBounds(700, 30, 100, 30);
		
		// 추가
		add(titleLa);
		add(js);
		add(dateLa);
		
	}
}
