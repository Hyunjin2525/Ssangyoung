package com.sist.common;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getimage(ImageIcon ii, int width, int height)
	{
		Image deimg = ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return deimg;
	}

}
