package com.sist.string;

import java.util.Scanner;

//charAt(0)
//코테
//문자열을 입력해서 좌우대칭여부 확인
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String data="";
		//오류 처리
		while(true)
		{
			System.out.println("문자열 입력:");
			data=scan.next();
			if(data.length()%2!=0)
			{
				System.out.println("문자 갯수가 짝수여야 합니다");
				continue;
			}
			break;
		}
		System.out.println("data="+data);
		
		boolean bCheck=false;
		int j=data.length()-1;
		for(int i=0;i<data.length()/2;i++)
		{
			if(data.charAt(i)==data.charAt(j))
			{
				bCheck=true;
			}
			j--;
		}
		if(bCheck==true)
		{
			System.out.println(data+"는 좌우대칭이 맞습니다");
		}
		else
		{
			System.out.println(data+"는 좌우대칭이 아닙니다");
		}

	}

}
