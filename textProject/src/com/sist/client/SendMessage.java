package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class SendMessage extends JFrame {
	JLabel la;
	JTextField tf;
	JTextArea ta;
	JButton b1, b2;
	
	public SendMessage()
	{
		la = new JLabel("받는 사람 : ");
		tf = new JTextField(10);
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		b1 = new JButton("전송");
		b2 = new JButton("취소");
		tf.setEnabled(false); // 값을 받아올거기때문에!!
		
		JPanel p1 = new JPanel();
		p1.add(la); p1.add(tf);
		
		JPanel p2 = new JPanel();
		p2.add(b1); p2.add(b2);
		
		add("North",p1);
		add("Center",js);
		add("South",p2);
		
		setSize(350,450);
		
	}
}
