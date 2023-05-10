package com.sist.manager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class DataCollectionManager {
	public static void main(String[] args) {
		
		List<MelonMusicVO> list=new ArrayList<MelonMusicVO>();
		FileOutputStream fo=null;
		ObjectOutputStream oos=null;
		try {
			fo=new FileOutputStream("C:\\java_datas\\Melon_MusicData.txt");
			oos=new ObjectOutputStream(fo);
			
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title= doc.select("div.wrap div.wrap_song_info div.rank01");
			Elements singer= doc.select("div.wrap div.wrap_song_info div.rank02");
			Elements album= doc.select("div.wrap div.wrap_song_info div.rank03");
			Elements poster= doc.select("div.wrap img");
			Elements etc= doc.select("div.wrap span.rank_wrap"); //etc로 한번에 묶어서 가져온다
					
		for(int i=0; i<title.size();i++)
		{
			MelonMusicVO vo=new MelonMusicVO();
			vo.setNo(i+1);
			vo.setTitle(title.get(i).text());
			vo.setSinger(singer.get(i).text());
			vo.setSinger(vo.getSinger().substring(0, vo.getSinger().length()/2));
			vo.setAlbum(album.get(i).text());
			vo.setPoster(poster.get(i).attr("src"));
			String state="";
			String id="";
			
			if(etc.get(i).text().contains("동일")) //etc로 묶어서 가져온 것 나누기
			{
				state="동일";
				id="0";
			}else if(etc.get(i).text().contains("상승"))
			{
				state="상승";
				id=etc.get(i).text().replaceAll("[가-힣]", "").trim();
			}
			else if(etc.get(i).text().contains("하락"))
			{
				state="하락";
				id=etc.get(i).text().replaceAll("[가-힣]", "").trim();
			} else {
				state ="NEW";
				id="0";
			}
			vo.setState(state);
			vo.setIdcrement(Integer.parseInt(id));
			list.add(vo);
			
		}
		oos.writeObject(list);
		System.out.println("저장 완료");
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fo.close();
				oos.close();
			} catch (Exception e) {}
		}
	}

}


