package com.sist.io;
import java.io.FileInputStream;
/*
 *  FileInputStream : 단위 byte (1byte씩 읽어온다)
 *    => 한글포함된 데이터는 읽을 수 있는데 한글이 깨진다 ------------- (FileReader)
 *       .zip , .ppt , .png... => 업로드/다운로드
 *       ----------------- 웹에서 자료실, 갤러리 게시판 만들기
 *    => 주요메소드 
 *       read() => 1byte => 리턴형 => int
 *       close() 닫기
 *    => 생성자
 *       new FileInputStream (File file)
 *       new FileInputStream (String path)
 *       
 */
import java.util.*;
public class FileInputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		 //파일 읽기
	     // System.in / System.out
	     // 표준 입출력
		 // 파일 읽기 //FileInputStream = 한글을 읽지 못한다 => FileReader는 가능
		FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\IntputOutputMain.java");
		int i=0; //1개의 문자를 읽어 온다 => 문자번호를 넘겨준다
		//문자번호를 받는 변수
		// -1은 더 이상 읽을 데이터가 없을때 까지 => EOF(End Of File) = -1
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
		}catch (Exception ex) {}
	}

}
