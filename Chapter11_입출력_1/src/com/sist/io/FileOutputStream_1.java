package com.sist.io;

import java.util.*;
import java.io.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//파일 지정
		   File file=new File("c:\\java_datas\\school.txt");
		 //파일 존재 여부 확인
		   if(!file.exists())
		   {
			   file.createNewFile(); //파일 만들기 명령
		   }
			FileOutputStream fos=new FileOutputStream(file,true); //append를 해야 기존에 파일에 계속 덛붙임
			String msg="안녕하세요 지금은 파일입출력하고 있습니다\r\n";
			//System.out.println((int)'안');
			fos.write(msg.getBytes());
			//String ==> byte[]로 변경 => getBytes()
			fos.close();
			System.out.println("저장 완료!");
			
		} catch (Exception e) {	}

	}

}
