package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.MelonMusicHomeVO;
import com.sist.manager.MelonMusicVO;
import com.sist.manager.MusicSystem;

public class Layout extends JFrame implements ActionListener, Runnable, MouseListener{
	MenuPanel mp;
	MainPanel mp2;
	RecomPanel rp;
	JButton b1,b2,b3,b4,b5,b6;
	ControlPanel controlp;
	Login login = new Login();
	JLabel logo;
	
	//페이지 지정
	int curpage = 1;
	int totalpage = 0;
	MusicSystem ms = new MusicSystem();
	
	//네트워크와 관련된 클래스
	Socket s;
	BufferedReader in;
	OutputStream out;
	
	//ID 저장
	String myId;
	
	//테이블 선택 인덱스 번호
	int selectRow = -1; // -1은 선택이 되지 않았을 때
	
	// 쪽지 보내기
	SendMessage sm = new SendMessage();
	RecvMessage rm = new RecvMessage();
	
	public Layout() {
		setTitle("2조 미니 프로젝트");
		
		mp = new MenuPanel();
		mp2 = new MainPanel();
		rp = new RecomPanel();
		controlp = new ControlPanel();
		logo=new JLabel();
		try 
		{
			URL url=new URL("https://www.brandbrief.co.kr/news/photo/202209/5519_11599_576.jpg"); 
			Image img=ImageChange.getImage(new ImageIcon(url),90,90);
			logo.setIcon(new ImageIcon(img));
		}catch (Exception e) 
		{
			
		}
		
		setLayout(null); // 사용자 정의 레이아웃
		logo.setBounds(10, 15, 90, 90);
		add(logo);
		mp.setBounds(10, 115, 90, 200);
		controlp.setBounds(110, 15, 850, 730);
		rp.setBounds(970, 15, 200, 730);
		
		b1 = new JButton("홈");
		b2 = new JButton("차트");
		b3 = new JButton("음악 검색");
		b4 = new JButton("채팅");
		b5 = new JButton("매거진");
		b6 = new JButton("나가기");
		
		//메뉴 패널에 버튼 추가
		mp.setLayout(new GridLayout(6,1,10,10));
		mp.add(b1); mp.add(b2); mp.add(b3); mp.add(b4); mp.add(b5); mp.add(b6);
		
		add(mp);
		add(controlp);
		add(rp);
		
		setSize(1200, 800);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		// 클릭했을 때 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		//로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// 채팅
		controlp.chatp.tf.addActionListener(this);
		
		albumDisplay();
		controlp.hp.b1.addActionListener(this);//이전
		controlp.hp.b2.addActionListener(this);//다음
		
		//테이블 선택 인덱스 번호 + 쪽지 보내기 + 정보 보기
		controlp.chatp.b1.addActionListener(this);
		controlp.chatp.b2.addActionListener(this);
		controlp.chatp.table.addMouseListener(this);
		
		//쪽지 보내기 관련 버튼
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
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
	
	public void chartDisplay() {
		List<MelonMusicVO> list = ms.musicListData();
		System.out.println(list.get(0).getTitle());
		controlp.cp.cardInit(list);
		controlp.cp.cardPrint(list);
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
			chartDisplay();
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
				s = new Socket("211.238.142.111", 11111);
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
		else if(e.getSource()==sm.b1)
		{
			String youId = sm.tf.getText();
			String msg = sm.ta.getText();
			if(msg.length()<1)
			{
				sm.ta.requestFocus();
				return;
			}
			try {
				out.write((Function.MSGSEND+"|"+youId+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			sm.setVisible(false); // 전송 버튼 누르면 내가 작성한 창 닫는 용도
		}
		else if(e.getSource()==sm.b2)
		{
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b1)
		{
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		}
		else if(e.getSource()==rm.b2)
		{
			rm.setVisible(false);
		}
		else if(e.getSource()==controlp.chatp.b1)
		{	//쪽지 보내기 버튼
			sm.ta.setText("");
			String youId = controlp.chatp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		}
		else if(e.getSource()==controlp.chatp.b2)
		{	//정보 보기 버튼
			
			//대상이 선택된 경우
			String youId = controlp.chatp.table.getValueAt(selectRow, 0).toString();
			try {
				out.write((Function.INFO+"|"+youId+"\n").getBytes());
			}catch(Exception ex) {}
		} else if(e.getSource()==b6) {
			try
			{
				out.write((Function.EXIT+"|"+myId+"\n").getBytes());
			}catch(Exception ex){}
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
						myId = st.nextToken();
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
					case Function.INFO:
					{
						String data = "아이디 : "+st.nextToken()+"\n"+"이름 : "+st.nextToken()+"\n"+"성별 : "+st.nextToken()+"\n";
						JOptionPane.showMessageDialog(this, data);
					}
					break;
					
					case Function.MSGSEND:
					{
						String id = st.nextToken();
						String strMsg = st.nextToken();
						rm.tf.setText(id);
						rm.ta.setText(strMsg);
						rm.setVisible(true);
					}
					break;
					case Function.MYEXIT:
					  {
						  dispose();// 윈도우 메모리 해제 
						  System.exit(0);// 프로그램 종료
					  }
					  break;
					  case Function.EXIT:
					  {
						  String mid=st.nextToken();
						  for(int i=0;i<controlp.chatp.model.getRowCount();i++)
						  {
							  String uid=controlp.chatp.table.getValueAt(i, 0).toString();
							  if(mid.equals(uid))
							  {
								  controlp.chatp.model.removeRow(i);
								  break;
							  }
						  }
					  }
					  break;
				}
			}
		}catch(Exception ex) {}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==controlp.chatp.table)
		{
			
			selectRow = controlp.chatp.table.getSelectedRow();
			String id = controlp.chatp.table.getValueAt(selectRow, 0).toString();
			
			if(id.equals(myId))
			{
				// 선택한 아이디가 내 아이디와 같으면 쪽지 보내기, 정보 보기 못하게 막아둠
				controlp.chatp.b1.setEnabled(false);
				controlp.chatp.b2.setEnabled(false);
			}
			else
			{
				controlp.chatp.b1.setEnabled(true);
				controlp.chatp.b2.setEnabled(true);
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
