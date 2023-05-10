package com.sist.client;
import java.awt.CardLayout;
import javax.swing.JPanel;
public class ControlPanel extends JPanel {
	HomePanel hp; 
	ChartPanel cp;
	DetailPanel dp;
	FindPanel fp = new FindPanel(); //화면 전환 불가능
	ChatPanel chatp = new ChatPanel();
	MagPanel magp = new MagPanel(); //매거진
	BoardListPanel bp;
	CardLayout card = new CardLayout();
	
	public ControlPanel()
	{
		bp=new BoardListPanel(this);//화면 전환 가능
		cp = new ChartPanel(this);
		dp = new DetailPanel(this);
		hp = new HomePanel(this);
		setLayout(card);
		add("home",hp);
		add("detail",dp);
		add("chart",cp);
		add("find",fp);
		add("chat",chatp);
		add("magazine",magp);
	}
}
