package com.sist.manager;
import java.io.*;
import java.util.*;
public class MusicSystem {
	
	private static List<MelonMusicVO> list = new ArrayList<MelonMusicVO>();
	
	static
	{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
		{
			fis = new FileInputStream("c:\\java_datas\\Melon_MusicData.txt");
			ois = new ObjectInputStream(fis);
			list = (List<MelonMusicVO>)ois.readObject();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			}catch(Exception ex){}
		}
	}
	
	public List<MelonMusicVO> musicFindData(String title)
	{
		List<MelonMusicVO> mList = new ArrayList<MelonMusicVO>();
		for(MelonMusicVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				mList.add(vo);
			}
		}
		return mList;
	}

}
