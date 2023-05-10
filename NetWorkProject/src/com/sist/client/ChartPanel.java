package com.sist.client;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.sist.manager.MelonMusicHomeVO;
import com.sist.manager.MelonMusicVO;
import com.sist.manager.MusicSystem;

public class ChartPanel extends JPanel implements MouseListener {
	ChartCard[] cc=new ChartCard[100];
	DefaultTableModel model;
	JTable table;
	JLabel la1,la2,la3,la4,la5,la6;
	JPanel pan=new JPanel();
	TableColumn column;
	public ChartPanel(ControlPanel cp)
	{
		String[] col= {"순위","상태","","곡명","가수","좋아요"};
		String[][] row=new String[0][6];
		model=new DefaultTableModel(row,col)
		{
			public boolean isCellEditable(int row, int column)
			{
				return false;
			}
		};
		
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		//배치
		setLayout(null);
		pan.setLayout(new GridLayout(100,1,5,5));
		la1.setBounds(100, 15, 100, 30 );
		la2.setBounds(220,15,100,30);
		la3.setBounds(330,15,100,30);
		la4.setBounds(440,15,100,30);
		la5.setBounds(550,15,100,30);
		la6.setBounds(660,15,100,30);
		add(la1);
		add(la2);
		add(la3);
		add(la4);
		add(la5);
		add(la6);
		add(pan);
		
		table.getColumn("순위").setPreferredWidth(30);
		table.getColumn("상태").setPreferredWidth(400);
		table.getColumn("").setPreferredWidth(100);
		table.getColumn("곡명").setPreferredWidth(150);
		table.getColumn("가수").setPreferredWidth(150);
		table.getColumn("좋아요").setPreferredWidth(50);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(45);
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer dt=new DefaultTableCellRenderer();
			if(i!=1)
			{
				dt.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(dt);
			
		}
		
	}
			
	
	public void cardPrint(List<MelonMusicVO> list) {
		int i=0;
		for(MelonMusicVO vo:list) {
			cc[i] = new ChartCard(vo);
			pan.add(cc[i]);
			i++;
		}
		for(int j=0;j<cc.length;j++) {
		cc[j].addMouseListener(null);
		}
	}
	public void cardInit(List<MelonMusicVO> list) {
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


