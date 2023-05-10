package com.sist.client;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.common.ImageChange;

public class RecomPanel extends JPanel {
	JLabel logo1,logo2,logo3;
	public RecomPanel() 
	{
		logo1=new JLabel();
		logo2=new JLabel();
		logo3=new JLabel();
		
		try 
		{
			URL url1=new URL("https://images.vexels.com/media/users/3/291687/isolated/preview/7e6ee1bcc330eb85073436a6e7db6b3d-cute-cat-singing-animal.png"); 
			URL url2=new URL("https://media.istockphoto.com/id/1227396770/vector/howling-corgi-dog-vector-cartoon-black-and-white-illustration-cute-sitting-friendly-welsh.jpg?s=612x612&w=0&k=20&c=gzbh2iMvFigcgJj9W4x0qC0KHhZzdXbZLDnybD9OP4w="); 
			URL url3=new URL("https://illustoon.com/photo/9064.png"); 
				
			Image img1=ImageChange.getImage(new ImageIcon(url1),150,210);
			Image img2=ImageChange.getImage(new ImageIcon(url2),150,215);
			Image img3=ImageChange.getImage(new ImageIcon(url3),150,245);
			
			logo1.setIcon(new ImageIcon(img1));
			logo2.setIcon(new ImageIcon(img2));
			logo3.setIcon(new ImageIcon(img3));
		}catch (Exception e) 
		{
			
		}
		logo1.setBounds(10,15,150,210);
		logo2.setBounds(10,175,150,215);
		logo3.setBounds(10,335,150,245);
		
		add(logo1);
		add(logo2);
		add(logo3);
	}
}
