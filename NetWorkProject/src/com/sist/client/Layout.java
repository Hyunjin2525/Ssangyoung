package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame implements ActionListener{
	MenuPanel mp;
	MainPanel mp2;
	RecomPanel rp;
	JButton b1,b2,b3,b4,b5;
	ControlPanel controlp;
	Login login = new Login();
	
	public Layout() {
		
		mp = new MenuPanel();
		mp2 = new MainPanel();
		rp = new RecomPanel();
		controlp = new ControlPanel();
		
		setLayout(null); // 사용자 정의 레이아웃
		mp.setBounds(10, 15, 90, 200);
		controlp.setBounds(110, 15, 850, 730);
		rp.setBounds(970, 15, 200, 730);
		
		b1 = new JButton("홈");
		b2 = new JButton("차트");
		b3 = new JButton("음악 검색");
		b4 = new JButton("채팅");
		b5 = new JButton("매거진");
		
		//메뉴 패널에 버튼 추가
		mp.setLayout(new GridLayout(5,1,10,10));
		mp.add(b1); mp.add(b2); mp.add(b3); mp.add(b4); mp.add(b5);
		
		add(mp);
		add(controlp);
		add(rp);
		
		setSize(1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 클릭했을 때 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// 채팅
		controlp.chatp.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new Layout();
	}
	
	//버튼 클릭했을 때
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			controlp.card.show(controlp, "home");
		}
		else if(e.getSource()==b2)
		{
			controlp.card.show(controlp, "chart");
		}
		else if(e.getSource()==b3)
		{
			controlp.card.show(controlp, "find");
		}
		else if(e.getSource()==b4)
		{
			controlp.card.show(controlp, "chat");
		}
		else if(e.getSource()==b5)
		{
			controlp.card.show(controlp, "magazine");
		}
		else if(e.getSource()==login.b1)
		{
			login.setVisible(false);
			setVisible(true);
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==controlp.chatp.tf)
		{
			controlp.chatp.initStyle();
			String msg = controlp.chatp.tf.getText();
			String color = controlp.chatp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			controlp.chatp.append(msg, color);
			controlp.chatp.tf.setText("");
		}
		
	}

}
