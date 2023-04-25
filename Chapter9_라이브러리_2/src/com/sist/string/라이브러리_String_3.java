package com.sist.string;

import java.util.Scanner;

//String메소드 (문자열 제어하는 기능)
/*
 *  String은 문자열 배열
 *  ------- 문자마다 인덱스번호를 가지고 있다 (0부터 시작)
 *  String s="Hello Java" 
 *            0123456789    ==>오라클은 1번
 *  주요기능 (310page)
 *  1) 문자열에서 문자 한개 추출 => char charAt(int index)
 *  
 */
public class 라이브러리_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		/*for(int i=0;i<msg.length();i++)
		{
			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
		} */
		//코딩 테스트 msg를 거꾸로 출력하는 프로그램
//		for(int i=msg.length()-1;i>=0;i--)
//		{
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
		//알파벳 문자열을 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
		
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 문자열 입력:");
		String num=scan.nextLine(); //nextline= 전체 문자
		//System.out.println(num);
		 
		int a=0,b=0;
		for(int i=0;i<num.length();i++)
		{
			char c= num.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			else if(c>='a' && c<='z')
				b++;
		}
		System.out.println("대문자 갯수:"+a);
		System.out.println("th문자 갯수:"+b);
	
	}

}
