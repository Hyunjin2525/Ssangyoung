package com.sist.client;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sist.manager.MelonMusicHomeVO;
import com.sist.manager.MelonMusicVO;
import com.sist.manager.MusicSystem;

public class ChartPanel extends JPanel implements MouseListener {
	ChartCard[] cc=new ChartCard[100];
	JLabel la1,la2,la3,la4,la5,la6;
	JPanel pan=new JPanel();
	public ChartPanel(ControlPanel cp)
	{
		
		la1=new JLabel("순위");
	    la2=new JLabel("상태"); // 자동 줄바꿈
	    la3=new JLabel("");
	    la4=new JLabel("곡명");
	    la5=new JLabel("가수");
	    la6=new JLabel("좋아요");

		setLayout(null);
	    
		pan.setLayout(new GridLayout(100, 1, 10, 1));
		pan.setPreferredSize(new Dimension(700,6800));
		JScrollPane js = new JScrollPane(pan);
		js.setPreferredSize(new Dimension(750,680));
		js.setBounds(80, 50, 760, 680);
		js.setBorder(null);
		add(js);
		la1.setBounds(80,15,30,30);
		la2.setBounds(125,15,30,30);
		la3.setBounds(180,15,50,30);
		la4.setBounds(245,15,250,30);
		la5.setBounds(510,15,150,30);
		la6.setBounds(675,15,100,30);
		
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		add(la5);
		add(la6);
	}
			
	
	public void cardPrint(List<MelonMusicVO> list) {
		int i=0;
		for(MelonMusicVO vo:list) {
			cc[i] = new ChartCard(vo);
			pan.add(cc[i]);
			i++;
		}
		for(int j=0;j<cc.length;j++) {
			cc[j].addMouseListener(null);
		}
	}
	public void cardInit(List<MelonMusicVO> list) {
		pan.removeAll();
		pan.validate();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	}


