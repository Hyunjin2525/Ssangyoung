package com.sist.utill;
// 네트워크 
/*
 *   String s="red|green|blue|black|yellow"
 *   => split, StringTokenizer
 *   => StringTokenizer st=new StringTokenizer(s,"|")
 *      --------------------------------------------
 *      String[] colors=s.split("\\|")
 *               => 원형: split(String regex)
 *      StringTokenizer st=new StringTokenizer(s,"|");
 *      
 *      hasMoreTokens
 *      1) cursor
 *      ------------------
 *      before First
 *      ------------------
 *       red => nextToken()
 *      ------------------
 *      green => nextToken()
 *      ------------------
 *      blue => nextToken()
 *      ------------------
 *      black => nextToken()
 *      ------------------
 *      yellow => nextToken()
 *      ------------------
 *      after Last => nextToken() => false(읽기 종료)
 *      ------------------
 *      
 *      **** 갯수가 초과되면 에러
 */

import java.util.StringTokenizer;

public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="red|green";
		 StringTokenizer st=new StringTokenizer(s,"|");
			
		 while(st.hasMoreTokens())
		 {
			 System.out.println(st.nextToken());
		 }

	}

}
