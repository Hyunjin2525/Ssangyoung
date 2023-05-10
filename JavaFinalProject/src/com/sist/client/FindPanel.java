package com.sist.client;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
import java.util.*;
import java.util.List;
import java.awt.event.*;
public class FindPanel extends JPanel implements ActionListener{
	
	JTextField findtf;
	JButton b1;
	JTable table;
	DefaultTableModel model;
	MusicSystem ms = new MusicSystem();
	
	public FindPanel()
	{
		// 초기화
		findtf = new JTextField();
		b1 = new JButton("검색");
		
		// 테이블
		String[] col = {"", "곡명", "가수명", "앨범"};
		Object[][] row = new Object[0][4];
		
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// 이미지 출력
				return getValueAt(0, columnIndex).getClass();
			}
		};
		
		table = new JTable(model);
		table.setRowHeight(50);
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js = new JScrollPane(table);
		
		// 배치
		// 850 730
		setLayout(null);
		findtf.setBounds(200, 15, 300, 30);
		b1.setBounds(510, 15, 100, 30);
		js.setBounds(10, 60, 840, 650);
		
		add(findtf);
		add(b1);
		add(js);
		
		b1.addActionListener(this);
		findtf.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1 || e.getSource()==findtf)
		{
			String title = findtf.getText();
			if(title.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				findtf.requestFocus();
				return;
			}
			findPrint(title);
		}
	}
	
	public void findPrint(String title)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
			try {
				List<MelonMusicVO> list = ms.musicFindData(title);
				for(MelonMusicVO vo:list)
				{
					URL url = new URL(vo.getPoster());
					Image img = ImageChange.getImage(new ImageIcon(url), 45, 45);
					Object[] data = {
						new ImageIcon(img),
						vo.getTitle(),
						vo.getSinger(),
						vo.getAlbum()
					};
					model.addRow(data);
				}
			}catch(Exception ex){ex.printStackTrace();}
		
	}
	
}
