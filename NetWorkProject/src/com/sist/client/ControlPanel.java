package com.sist.client;
import java.awt.CardLayout;
import javax.swing.JPanel;
public class ControlPanel extends JPanel {
	HomePanel hp = new HomePanel();
	ChartPanel cp = new ChartPanel();
	FindPanel fp = new FindPanel();
	ChatPanel chatp = new ChatPanel();
	MagPanel magp = new MagPanel();
	
	CardLayout card = new CardLayout();
	
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("chart",cp);
		add("find",fp);
		add("chat",chatp);
		add("magazine",magp);
	}
}
