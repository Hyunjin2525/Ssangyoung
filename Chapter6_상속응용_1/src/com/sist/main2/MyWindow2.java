package com.sist.main2;
//포함 // 포함은 수정이 불가능 //포함하고 있는 클래스가 크다 (상속은 상속을 주는 클래스가 큼)
import javax.swing.*;


public class MyWindow2 {
	JFrame f=new JFrame();
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;  //전부 포함클래스
	public MyWindow2()
	{
	
		la1=new JLabel("아이디");
	la2=new JLabel("비밀번호");
	tf=new JTextField();
	pf=new JPasswordField();
	b1=new JButton("로그인");
	b2=new JButton("취소");
	f.setLayout(null);
	la1.setBounds(10, 15, 50, 30);
	la2.setBounds(10, 50, 55, 30);
	tf.setBounds(70, 15, 150, 30);
	pf.setBounds(70, 50, 150, 30);
	JPanel p=new JPanel();
	p.add(b1);
	p.add(b2);
	p.setBounds(10, 90, 210, 35);
	f.add(p);
	f.add(la1);f.add(tf);
	f.add(la2);f.add(pf);
	
		f.setSize(640,480);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow2(); //생성자 호출은 => 

	}

}
