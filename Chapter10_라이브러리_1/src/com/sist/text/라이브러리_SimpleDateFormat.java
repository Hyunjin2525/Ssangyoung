package com.sist.text;
/*
 *  java.text => 출력 형태를 만들어서 사용 (변경)
 *  ----------
 *   SimpleDateFormat : 날짜 변경
 *   DecimalFormat : 숫자변환
 *   ------------- 가격출력 10,000원
 *   MessageFormat : 데이터베이스 => INSERT,UPDATE
 *   -------------
 *   String name="", sex="", addr="",tel="";
 *   int age
 *   
 *   String sql="INSERT INTO member VALUES("
 *              +"'"+name+"','"+sex+"','"+"+addr+"','"+tel+"',"+age+")";
 *   String sql="INSERT INTO member VALUES('{1}','{2}','{3}','{4}',{5})
 */
import java.util.*;
import java.text.*;
public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.Date date=new java.util.Date(); //import가 충돌 될 때
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		/*				오라클
		 *   yyyy년도 ==> rrr
		 *   MM 월   ==> mm
		 *   dd 일   ==> dd
		 *   hh 시간  ==> hh24
		 *   mm 분    ==>mi
		 *   ss 초    ==>ss
		 */
		

	}

}
