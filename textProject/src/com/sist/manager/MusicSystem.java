package com.sist.manager;
import java.io.*;
import java.util.*;
public class MusicSystem {
	
	private static List<MelonMusicVO> list = new ArrayList<MelonMusicVO>();
	private static List<MelonMusicHomeVO> hList = new ArrayList<MelonMusicHomeVO>();
	
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
		try
		{
			fis = new FileInputStream("c:\\java_datas\\Melon_MusicDataHome.txt");
			ois = new ObjectInputStream(fis);
			hList = (List<MelonMusicHomeVO>)ois.readObject();
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
	
	public List<MelonMusicVO> musicListData(){
//		List<MelonMusicVO> list = new ArrayList<MelonMusicVO>();
//		for(int i=0;i<10;i++) {
//			list.add(this.list.get(i));
//		}
		return list;
	}
	
	//홈 뮤직데이터 6개씩 나눠서 전송
	public List<MelonMusicHomeVO> albumListData(int page){
		List<MelonMusicHomeVO> gList = new ArrayList<MelonMusicHomeVO>();
		int j=0; 
		int rowSize=6;
		int start=(page-1)*rowSize;
		
		for(int i=0;i<list.size();i++) {
			if(albumTotlaPage() == page) {
				if(j<hList.size()%rowSize && i>=start) {
					gList.add(hList.get(i));
					j++;
				}
			} else {
				if(j<rowSize && i>=start) {
					gList.add(hList.get(i));
					j++;
				}
			}
			
		}
		
		return gList;
	}
	
	public int albumTotlaPage() {
		return (int)(Math.ceil(hList.size()/6.0));
	}
	
	public MelonMusicHomeVO albumDetailData(String title) {
		MelonMusicHomeVO vo = new MelonMusicHomeVO();
		for(MelonMusicHomeVO mvo:hList) {
			if(mvo.getTitle().equals(title)) {
				vo=mvo;
			}
		}
		return vo;
	}
	

}
