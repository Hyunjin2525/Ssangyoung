package com.sist.client;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
public class ChatPanel extends JPanel {
	JTextPane tpane; // 편집이 가능
	JTextField tf;
	JButton b1, b2;
	JTable table;
	JComboBox<String> box;
	DefaultTableModel model; // 데이터 관리
	// 850, 730
	public ChatPanel() {
		// 초기화
		tpane = new JTextPane();
		tpane.setEditable(false);
		JScrollPane js1 = new JScrollPane(tpane);
		tf = new JTextField();
		box = new JComboBox<String>();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		
		// 테이블
		String[] col = {"아이디","이름","성별"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row,col);
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		b1 = new JButton("쪽지 보내기");
		b2 = new JButton("정보보기");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 배치
		setLayout(null);
		js1.setBounds(10, 15, 600, 600);
		tf.setBounds(20, 620, 450, 30);
		box.setBounds(470, 620, 130, 30);
		js2.setBounds(620, 15, 230, 250);
		p.setBounds(620, 270, 230, 35);
		
		add(js1);
		add(tf);
		add(box);
		add(js2);
		add(p);
		
		String[] data = {"hong", "홍길동", "남자"};
		model.addRow(data);
		
		// 이벤트
		
	}
	public void initStyle()
	{
		Style black = tpane.addStyle("black", null);
		StyleConstants.setForeground(black, Color.black);
		
		Style blue = tpane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style yellow = tpane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style pink = tpane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style green = tpane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style cyan = tpane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style orange = tpane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
	}
	public void append(String msg, String color)
	{
		try {
			Document doc = tpane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", tpane.getStyle(color));
		}catch(Exception ex) {}
	}
}
