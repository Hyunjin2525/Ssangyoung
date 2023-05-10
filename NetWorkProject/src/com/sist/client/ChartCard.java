package com.sist.client;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;

import com.sist.manager.MelonMusicVO;
import com.sist.manager.MusicSystem;

public class ChartCard extends JPanel{
	JLabel la1=new JLabel();//여러줄 출력 불가능
	JLabel la2=new JLabel();//여러줄 출력 불가능
	JLabel la3=new JLabel();//여러줄 출력 불가능
	JLabel la4=new JLabel();//여러줄 출력 불가능
	JLabel la5=new JLabel();//여러줄 출력 불가능
	JLabel la6=new JLabel();//여러줄 출력 불가능
	
	public ChartCard(MelonMusicVO vo)
	{
		
	
		setLayout(null);
		la1.setBounds(100, 15, 100, 30 );
		la2.setBounds(220,15,100,30);
		la3.setBounds(330,15,100,30);
		la4.setBounds(440,15,100,30);
		la5.setBounds(550,15,100,30);
		la6.setBounds(660,15,100,30);
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		add(la5);
		add(la6);
	   
		
		
		try {
			URL url = new URL(vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 30, 30);
			
			
			la1.setText(String.valueOf(vo.getNo()));
			la2.setText(vo.getState());
			la3.setIcon(new ImageIcon(img));
			la4.setText(vo.getTitle());
			la5.setText(vo.getSinger());
			la6.setText(String.valueOf(vo.getHit()));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
