package com.sist.main2;
//상속

import javax.swing.*;
import java.awt.*;
/*
 *  class A
 *  class B
 *  
 *  class B extends A A>B
 *  
 *  class B
 *  {
 *    A a;
 *    
 *  }
 *  
 *  B > A
 */
//생성자, 초기화 블록, static => 제외
public class MyWindow extends JFrame {
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	public MyWindow()  //생성자는 시작하자마자 실행할 기능을 쓸 때 사용
	{
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		setLayout(null);
		la1.setBounds(10, 15, 50, 30);
		la2.setBounds(10, 50, 55, 30);
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		add(p);
		add(la1);add(tf);
		add(la2);add(pf);
		
		setSize(640,480);
		setVisible(true);// 자동로그인
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyWindow m=new MyWindow();

	}

}
