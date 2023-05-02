package com.sist.io2;
import java.util.*;
import java.io.*;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList=new ArrayList<Student>();
	// 파일을 읽어서 메모리에 저장
	// web => String, Window => String
	static
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_datas\\school.txt");
			StringBuffer sd=new StringBuffer();
			int i=0;//문자받기
			while((i=fr.read())!=-1)
			{
				 sd.append((char)i);
			}
			// 1|홍길동|90|90|90|270|90.00\n
			String[] stds=sd.toString().split("\r\n");
			// 학생별 구분
			for(String ss:stds)
			{
				StringTokenizer st=new StringTokenizer(ss,"|");
				//학생 데이터별
				Student s=new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total=s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
		}catch (Exception ex) 
		{
			ex.printStackTrace(); //에러 위치 확인
		}
		finally 
		{
			try 
			{
				fr.close();
			} catch (Exception e) {}
		
		}
	}
	public int menu() 
	{
		System.out.println("===== 메뉴 ======");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("=================");
		int no=0;
		try 
		{
		
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			// 키보드 읽기 => 예외처리 => Scanner를 대체
		System.out.println("메뉴번호 입력:");
		String str=in.readLine();
		no=Integer.parseInt(str);
		} catch (Exception e) {	}
		return no;
	}
	public void process() 
	{
	  while(true) 
	  {
		int no=menu();
		if(no==5)
		{
			System.out.println("프로그램 종료");
			FileWriter fw=null;//한글 저장시
			// FileOutPutStream => FileWriter가 편리
			try
			{
				fw=new FileWriter("c:\\java_datas\\school.txt");
				// 자바 프로그램과 파일 연결 => 스트림 (출력 스트림)
				// 2byte씩 전송한다 (문자 스트림) => 한글(2byte)
				// 알파벳, 숫자는 1byte, 2byte 상관없이 가능
				String temp="";
				for(Student ss:stdList)
				{
					temp=ss.getHakbun()+"|"+ss.getName()+"|"
							+ss.getKor()+"|"+ss.getEng()+"|"
							+ss.getMath()+"\n";
				}
				fw.write(temp);
				
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				try {
					fw.close();
				} catch (Exception e) {
				}
			}
			break;
		}
		else if(no==1)
		{
			for(Student ss:stdList)
			{
				int total=ss.getKor()+ss.getEng()+ss.getMath();
				ss.setTotal(total);
				ss.setAvg(total/3.0);
				
				System.out.println(ss.getHakbun()+" "+ss.getName()
						+" "+ss.getKor()+" "+ss.getEng()+" "
									+ss.getMath()+" "+ss.getTotal()+" "
									+String.format("%.2f", ss.getAvg()));
			}
		}
		 else if(no==2)
		  {
			 	try {
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("이름 입력:");
				String name=in.readLine();
				System.out.println("국어점수 입력:");
				String kor=in.readLine();
				System.out.println("영어점수 입력:");
				String eng=in.readLine();
				System.out.println("수학점수 입력:");
				String math=in.readLine();
				
				int max=0;
				for(Student ss:stdList)
				{
					if(ss.getHakbun()>max)
					{
						max=ss.getHakbun();
								
					}
					
				
				}
				Student s=new Student();
				s.setName(name);
				s.setHakbun(max+1);
				s.setKor(Integer.parseInt(kor));
				s.setEng(Integer.parseInt(eng));
				s.setMath(Integer.parseInt(math));
				stdList.add(s);
					
		  }catch (Exception e) {}
	  }
		 else if(no==4)
		 {
			 try {
				 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				 System.out.print("학번 입력:");
				 String hak=in.readLine();
				 int i=0;
				 for(Student ss:stdList)
				 {
					 if(ss.getHakbun()==Integer.parseInt(hak))
					 {
						 stdList.remove(i);
						 break;
					 }
					 i++;
				 }
			 }catch (Exception e) {	}
		 }
	 
	}

	}
}


