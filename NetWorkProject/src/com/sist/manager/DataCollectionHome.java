package com.sist.manager;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DataCollectionHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MelonMusicHomeVO> list=new ArrayList<MelonMusicHomeVO>();
		FileOutputStream fo=null;
		 ObjectOutputStream oos=null;
		try {
			fo=new FileOutputStream("C:\\java_datas\\Melon_MusicDataHome.txt");
			oos=new ObjectOutputStream(fo);
			
			for(int i=1;i<=60;i+=20) {
				
			}
			Document doc=Jsoup.connect("https://www.melon.com/new/album/index.htm#params%5BareaFlg%5D=I&params%5BorderBy%5D=issueDate&po=pageObj&startIndex=21").get();
			Elements title= doc.select("div.service_list_album div.entry a.album_name");
			Elements subtitle= doc.select("div.service_list_album div.entry span.vdo_name");
			Elements singer= doc.select("div.service_list_album div.entry span.checkEllipsis a.artist_name");
			Elements poster= doc.select("div.service_list_album div.thumb a.image_typeAll img");
			Elements date= doc.select("div.service_list_album div.meta span.reg_date"); 
		
			for(int i=0; i<title.size();i++)
			{
				MelonMusicHomeVO vo=new MelonMusicHomeVO();
				vo.setNo(i+1);
				vo.setTitle(title.get(i).text());
				vo.setSubtitle(subtitle.get(i).text());
				vo.setSinger(singer.get(i).text());
				vo.setPoster(poster.get(i).attr("src"));
				vo.setDate(date.get(i).text());
				System.out.println("=============");
				System.out.println(vo.getTitle()+" "+vo.getPoster());
				list.add(vo);
				
			
				
		    }
			oos.writeObject(list);
			System.out.println("저장완료");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fo.close();
				oos.close();
			}catch (Exception e) {}
		}
		
					

		}
	}


