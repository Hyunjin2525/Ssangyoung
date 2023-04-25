package com.sist.string;
import java.io.*;
public class 라이브러리_String_2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				data.append((char)i);
			}
			long end=System.currentTimeMillis();
		
			fr.close();
			System.out.println(data.toString());
			System.out.println("걸린 시간:"+(end-start));
		}catch(IOException ex)
		{
			ex.printStackTrace(); //에러 메세지 확인
			//getMessage()
			
		}
	}

}
