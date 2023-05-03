package com.sist.io;
// BufferedReader/BufferedWriter => 필터스트림
import java.io.*;
public class 입출력_4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter out=new FileWriter("c:\\java_datas\\movie_1.txt");//자동으로 지정된 파일을 생성, 이미 존재하는 경우에는 덮어쓴다 (create)
													      // 추가 기능 new FileWriter("c:\\java_datas\\movie_1.txt",true);(append모드)
		FileReader in=new FileReader("c:\\javaDev\\movie.txt");//기반 스트림
		
		BufferedReader br=new BufferedReader(in);
		BufferedWriter bw=new BufferedWriter(out);
		while(true)
		{
			String data=br.readLine();
			if(data==null) break;
			bw.write(data+"\n");
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
