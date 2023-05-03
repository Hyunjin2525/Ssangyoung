package com.sist.io;
//파일쓰기
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;//BufferedWriter
		FileReader in=null;//BufferedReader
		
		try 
		{
			//1.파일 만들기
			File file=new File("c:\\java_datas\\movie.txt");
			if(!file.exists()) // 파일이 존재하지 않는다면
			{
				//파일을 생성
				file.createNewFile();
			}
			//파일 읽기
			in=new FileReader("c:\\javaDev\\movie.txt");
			out=new FileWriter(file);
			//out=new FileWriter("c:\\java_datas\\movie.txt"); // 방법 2
			//생성된 파일 쓰기
			int i=0;
			while((i=in.read())!=-1)
			{
				out.write(i);
			}
			System.out.println("파일 읽기/쓰기 완료");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try {
				in.close();
				out.close();
			} catch (Exception e2) {}
			
		}
	}

}
