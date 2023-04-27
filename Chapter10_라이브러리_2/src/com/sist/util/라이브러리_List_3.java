package com.sist.util;
import java.util.*;
/*
 *   subList(int start,int end) => index번호가 start부터 end까지 부분적을 데이터 복사 
 *   											      --- (end-1)
 *   
 *   ==> 페이지 나누기
 *   addAll() => ArrayList가 가지고 있는 모든 데이터 복사
 *   retainAll() => 두개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 *   Collections.sort() => ArrayList 정렬
 */

public class 라이브러리_List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names1=new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		for(Object i:names1)
		{
			System.out.println(i);
		}
		System.out.println("======================");
		ArrayList names2=new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("춘향");
		ArrayList namesub=new ArrayList();
		namesub.addAll(names1);
		namesub.retainAll(names2);
		// 교집합 =>retainAll
		//names1.retainAll(names2);//names1과 names2에 데이터에 같은 데이터를 찾아라
								  // 찾은 데이터를 names1에 저장해라
		
		for(Object i:names1)
		{
			System.out.println(i);
		}
		System.out.println("======================");
		for(Object i:namesub)
		{
			System.out.println(i);
		}
		


	}

}
