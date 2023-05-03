package com.sist.io;
//파일 일기
//FileInputStream (1byte) / FileReader (2byte)
// 한글이 포함 ==> 반드시 2byte씩 읽어야 -> 한글 깨짐 방지가 가능하다
import java.util.*;
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\movie.txt");
			BufferedReader bfr=new BufferedReader(fr);
			//네트워크 통신시에도 많이사용
			int i=0;// 한글자씩 읽기 => read()
			//int read() => 글자의 ASC코드를 읽어온다 (정수)
			//A => read() => 65
			//int read(byte[],int,int) => 읽은 바이트 수
			long start=System.currentTimeMillis();
			while((i=bfr.read())!=-1)//전체 데이터를 읽을 경우
			{
				System.out.print((char)i);
			}
//			while(true)
//			{
//				String data=bfr.readLine();
//				if(data==null)
//					{break;
//					}
//					
//				System.out.print(data);
//			}
			long end=System.currentTimeMillis();
			System.out.println("읽은 시간:"+(end-start));
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			fr.close();
			}catch (Exception e) {	}
		}

	}

}
