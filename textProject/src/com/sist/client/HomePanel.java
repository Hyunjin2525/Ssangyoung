package com.sist.client;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.sist.common.ImageChange;
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
		pan.setLayout(new GridLayout(2,3,10,5));
		
		pan.setBounds(50, 15, 730, 670);
		add(pan);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pageLa);
		p.add(b2);
		p.setBounds(50, 700, 730, 35);
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
		for(int i=0;i<pcs.length;i++) {
			if(e.getSource() == pcs[i]) {
//				JOptionPane.showMessageDialog(this, i+"번째 호출");
				String title = pcs[i].tLa.getText();
//				JOptionPane.showMessageDialog(this, title);
				MelonMusicHomeVO vo = ms.albumDetailData(title);
				try {
					URL url = new URL(vo.getPoster());
					Image img = ImageChange.getImage(new ImageIcon(url), 400, 400);
					cp.dp.imgLa.setIcon(new ImageIcon(img));
					cp.dp.subtitleLa.setText(vo.getSubtitle());
					cp.dp.titleLa.setText(vo.getTitle());
					cp.dp.singerLa.setText(vo.getSinger());
					cp.dp.dateLa.setText(vo.getDate());
					cp.card.show(cp, "detail");
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
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
