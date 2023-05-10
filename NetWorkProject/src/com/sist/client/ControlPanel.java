package com.sist.client;
import java.awt.CardLayout;
import javax.swing.JPanel;
public class ControlPanel extends JPanel {
	HomePanel hp;
	ChartPanel cp;
	FindPanel fp = new FindPanel();
	ChatPanel chatp = new ChatPanel();
	MagPanel magp = new MagPanel(); //매거진
	
	CardLayout card = new CardLayout();
	
	public ControlPanel()
	{
		cp = new ChartPanel(this);
		hp = new HomePanel(this);
		setLayout(card);
		add("home",hp);
		add("chart",cp);
		add("find",fp);
		add("chat",chatp);
		add("magazine",magp);
	}
}
