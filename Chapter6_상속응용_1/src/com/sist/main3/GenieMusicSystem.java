package com.sist.main3;

import java.net.MulticastSocket;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	//모든 사람에게 공유
	protected  Music[] musics=new Music[50]; //지니 페이지가 모든 유저에게 동일하게 나타나기 때문에 static(데이터를 공유할 때)
	protected String title="지니뮤직 Top50";
	//1. 초기화
	/*
	 *  인스턴스 블록
	 *  static 블록 ***** (music이 static이기 때문에)
	 *  ----------- 자동 호출
	 *  생성자
	 *  
	 *  예외처리
	 *  --------
	 *     |
	 *    에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *           메모리 공간 부족
	 *    예외 => 수정이 가능한 에러
	 *        => 예외복구 / 예외회피 
	 *        => 비정상 종료 방지하고 정상 수행이 가능하게...
	 *        => io,net,thread,web
	 *           -- ---   ----- ---
	 *                    충돌    => 404, 500, 403, 412, 400 ...
	 *              IP/URL
	 *          파일 경로명, 파일명
	 *        => 에러
	 *           사용자 입력
	 *           프로그래머의 실수
	 */
	
	{
		try 
		{
			   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			   // 문서 저장 공간 => HTML
			   //System.out.println(doc.toString());  // HTML 갖고오기
			   /*
			    *  HYML => tag <> => Markup language
			    *  <a>값</a>
			    *  Element => tag
			    *  Elements => 같은 태그 여러개를 모아준 것
			    */
			   //노래명 <table class="list-wrap">
			   // 구분자 => 모든 태그 class (중복) / id (중복이 없다)
			   //class=> . id=> #
			   Elements title=doc.select("table.list-wrap td.info a.title");
			   
			   //가수명
			   Elements singer=doc.select("table.list-wrap td.info a.artist");
			 
			   //앨범명
			   Elements album=doc.select("table.list-wrap td.info a.albumtitle");
//			   System.out.println(album);
			   
			   Elements etc=doc.select("table.list-wrap td.number span");
//			   System.out.println(etc);
			   
			   for(int i=0;i<title.size();i++) //저장된 갯수 가져온다
			   {
//				   System.out.println("순위:"+(i+1));
//				   System.out.println("노래명:"+title.get(i).text());
//				   System.out.println("가수명:"+singer.get(i).text());
//				   System.out.println("앨범:"+album.get(i).text());
				   String s=etc.get(i).text();
				   String state="";
				   String value="";
				   if(s.equals("유지"))
				   {
					   state="유지";
					   value="0";
				   }
				   // 2상승
				   else
				   {
					   state=s.replaceAll("[0-9]","");
					   value=s.replaceAll("[가-힣]","");
					   /*
					    *  split
					    *  replaceAll
					    *  ---------- 정규식 (한글형대,숫자형태 => 패턴)
					    *  [0-9] => 숫자 전체
					    *  [가-힣] => 한글 전체
					    *  [A-Za-z] => 알파벳 전체
					    */
				   }
//				   System.out.println("상태:"+state);
//				   System.out.println("등폭:"+value);
//				   System.out.println("===================================");
				   
				   musics[i]=new Music();
				   musics[i].setRank(i+1);
				   musics[i].setTitle(title.get(i).text());
				   musics[i].setSinger(singer.get(i).text());
				   musics[i].setAlbum(album.get(i).text());
				   musics[i].setState(state);
				   musics[i].setIdcrment(value);
				   
			   }
		}catch(Exception ex) {}
		
	 
		
		
	}
    //2.기능 (어떤 기능) ==> 메소드
	public Music[] musicAllData()
	{
		return musics;
	}
	//2-1. 목록 출력 => type=1 title, type=2 singer, type=3 album...
	/*
	 *  결과값을 전송 : 리턴형 // **웹에선 리턴형 주로 사용 (브라우저에 보내기 위해)
	 *  자체 출력 : void = 브라우저에 보내지 못함
	 */
	public Music[] musicFind(String fd,int type)
	{
		int i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
			bCheck=m.getTitle().contains(fd);
			if(bCheck==true)
			i++;
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
				if(bCheck==true)
				i++;
			}
			
		}
		Music[] mm=new Music[i];
		i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
			bCheck=m.getTitle().contains(fd);
		
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
			
			}
			
			if(bCheck==true) 
			{
				mm[i]=m;
				i++;
				
			}
			
		}
		return mm;
		
	}
	
	
	
	//2-2. 검색
	public static void main(String[] args) {
		GenieMusicSystem g=new GenieMusicSystem();	
		Music[] aa=g.musicFind("사", 2);
		for(Music aaa:aa)
		{
			System.out.println(aaa.getSinger());
		}
		}
}
