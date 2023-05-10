package com.sist.client;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.manager.MelonMusicHomeVO;
import com.sist.manager.MusicSystem;

public class HomePanel extends JPanel implements MouseListener{
	HomeCard[] pcs = new HomeCard[6];
	JPanel pan = new JPanel();
	JButton b1, b2;
	JLabel pageLa;
	ControlPanel cp;
	MusicSystem ms = new MusicSystem();
	
	public HomePanel(ControlPanel cp) {
		this.cp = cp;
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		pageLa = new JLabel("0 page / 0 pages");
		
		setLayout(null);
		pan.setLayout(new GridLayout(2,3,5,5));
		
		pan.setBounds(10, 15, 730, 670);
		add(pan);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pageLa);
		p.add(b2);
		p.setBounds(10, 700, 730, 35);
		add(p);
	}
	
	public void cardPrint(List<MelonMusicHomeVO> list) {
		int i=0;
		for(MelonMusicHomeVO vo:list) {
			pcs[i] = new HomeCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		for(int j=0;j<pcs.length;j++) {
			pcs[j].addMouseListener(this);
		}
	}
	
	public void cardInit(List<MelonMusicHomeVO> list) {
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
