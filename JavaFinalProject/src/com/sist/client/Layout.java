package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.manager.MelonMusicHomeVO;
import com.sist.manager.MelonMusicVO;
import com.sist.manager.MusicSystem;

public class Layout extends JFrame implements ActionListener, Runnable{
	MenuPanel mp;
	MainPanel mp2;
	RecomPanel rp;
	JButton b1,b2,b3,b4,b5;
	ControlPanel controlp;
	Login login = new Login();
	
	//페이지 지정
	int curpage = 1;
	int totalpage = 0;
	MusicSystem ms = new MusicSystem();
	
	//네트워크와 관련된 클래스
	Socket s;
	BufferedReader in;
	OutputStream out;
	
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
		
		albumDisplay();
		controlp.hp.b1.addActionListener(this);//이전
		controlp.hp.b2.addActionListener(this);//다음
		
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new Layout();
	}
	
	public void albumDisplay() {
		totalpage = ms.albumTotlaPage();
		
		List<MelonMusicHomeVO> list = ms.albumListData(curpage);
		
		controlp.hp.cardInit(list);
		controlp.hp.cardPrint(list);
		controlp.hp.pageLa.setText(curpage + " page / " + totalpage + " pages");
	}
	
	//버튼 클릭했을 때
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			curpage=1;
			albumDisplay();
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
			String id = login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name = login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex = "남자";
			if(login.rb1.isSelected())
			{
				sex = "남자";
			}
			else
				sex = "여자";
			
			try {
				//localhost 서버 컴퓨터 IP로 변경할것!!!
				s = new Socket("localhost", 11111);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
				
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			new Thread(this).start();
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==controlp.chatp.tf)
		{
			String msg = controlp.chatp.tf.getText();
			String color = controlp.chatp.box.getSelectedItem().toString();
			
			if(msg.length() <1) return;
			
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			controlp.chatp.tf.setText("");
		}
		else if(e.getSource() == controlp.hp.b1) {
			if(curpage > 1) {
				curpage--;
				albumDisplay();
			}
		}
		else if(e.getSource() == controlp.hp.b2) {
			if(curpage < totalpage) {
				curpage++;
				albumDisplay();
			}
		}
		
	}

	@Override
	public void run() {
		try {
			while(true)
			{
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol)
				{
					case Function.LOGIN :
					{
						// 로그인하면 정보 테이블에 추가 => 출력
						String[] data = {st.nextToken(), st.nextToken(), st.nextToken()};
						controlp.chatp.model.addRow(data);
					}
					break;
					// 모든 명령을 서버로부터 받아서 처리해야함
					case Function.MYLOG :
					{
						setTitle(st.nextToken());
						login.setVisible(false);
						setVisible(true);
					}
					break;
					
					case Function.CHAT :
					{
						controlp.chatp.initStyle();
						controlp.chatp.append(st.nextToken(), st.nextToken());
						//			   채팅 문자열			글씨 색상
					}
					break;
				}
			}
		}catch(Exception ex) {}
		
	}

}
