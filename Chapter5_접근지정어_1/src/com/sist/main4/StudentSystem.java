package com.sist.main4;
import com.sist.main3.Student; 
//패키지명이 다르면 => 사용시에 반드시 import를 사용한다
import java.util.Scanner;
public class StudentSystem {
	private Student[] std=new Student[3];
	// Student s=new Student()
	//1. 학생 초기화
	/*
	 *  1. 명시적 초기화 => 객체 생성시 모든 객체값이 동일
	 *  2. 생성자 이용
	 *  3. 초기화 블록
	 *  4. 메소드
	 *  ----------- 입력값을 받거나 외부에 데이터 읽기
	 *                                 --------- 크롤링, 파일
	 *     ** class영역에서는 선언과 동시에 초기화
	 *       ------- 제어문, 외부 라이브러리 호출 불가능 {}                           
	 */
	public void intit()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
		    std[i]=new Student(); //배열은 모든 저장공간이 null(메모리 연결)
			//     -------------- 메모리 연결하는 부분
			System.out.print("학번 입력:");
			std[i].setHakbun(scan.nextInt());
			System.out.print("이름 입력:");
			std[i].name=scan.next();
			System.out.print("국어 영어 수학 입력(80 90 100):");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
			System.out.print("성별 입력:");
			std[i].setSex(scan.next());
			
		}
	}
	//1-1 출력
	public void display() //default => com.sist.main4안에서만 접근이 가능
	{                 //public을 사용하면 com.sist.main5로 접근 가능 
		for(Student s:std)
		{
			System.out.println(s.getHakbun()+" "+s.name+" "
		                       +s.getKor()+" "+s.getEng()+" "
		                       +s.getMath()+" "+s.getSex()+" "
		                       +s.getTotal()+" "+s.getAvg()+" "+s.getScore()+" "+s.getRank());
		}
	}
	//2. 평균 구하기
	public void stdAvg()
	{
		for(int i=0;i<std.length;i++)
		{
			std[i].setAvg(std[i].getTotal()/3.0); //비공개
			//std[i].avg=std[i].getTotal()/3.0 //공개
		}
	}
	//3. 총점 구하기
	public void stdTotal()
	{
		for(int i=0;i<std.length;i++)
		{
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());
		}
	}
	//4. 학점 구하기
	public void stdScore()
	{
		char c='A';
		for(int i=0;i<std.length;i++)
		{
			switch((int)(std[i].getAvg())/10)
			{
			case 10:
				case 9:
					c='A';
					break;
				case 8:
					c='B';
					break;
				case 7:
					c='C';
					break;
				case 6:
					c='D';
					break;
					default:c='F';
					
			}
			std[i].setScore(c);
		}
	}
	//5. 등수 구하기
	public void stdRank() 
	{
		for(int i=0;i<std.length;i++)
		{
			std[i].setRank(1);
			for(int j=0;j<std.length;j++)
			{
				if(std[i].getTotal()<std[j].getTotal())
				{
					std[i].setRank(std[i].getRank()+1);
				}
			}
		}
		
	}
	

}
