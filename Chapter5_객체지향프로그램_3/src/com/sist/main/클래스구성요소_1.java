package com.sist.main;// 첫순서에 있어야 함

import java.lang.reflect.Array;
import java.util.Arrays;

//폴더 => 관련된 java파일 저장 => 찾기
//다른패키지의 클래스를 불러올 때 반드시 import를 사용해야 된다
//import com.sist.main.클래스구성요소_1;
//import com.sist.main.*;// * = 모든 클래스를 불러온다는 뜻
//import java.util.*;
// 주의점 : 키워드는 사용할 수 없다 (대소문자 구분 => 소문자 권장)
//슷자를 앞에 사용할 수 없다
//com.sist.class com.sist.public => 오류
// 다른 패키지에서는 같은 이름의 클래스를 만들 수 있다
// => 메소드 => 접근방식 . 을 이용한다 
// => 인스턴스 메소드 => static이 없는 메소드 => 메모리에 따로 저장  //static보다 인스턴스가 더 자주 쓰인다
// => 클래스의 분리
/*
 *     클래스
 *     = 데이터형
 *     = 액션(동작) => 메소드
 *     ---------------------
 *     
 *     1) 데이터형
 *     2) 데이터 처리
 *     3) 조립 => main => 메인보드
 *    -----------------------------
 *    1. 메소드의 구성요소
 *       리턴타입(결과값) 메소드명(매개변수 -> 요청데이터) => 선언부
 *       ------------ 일치(데이터형)
 *       {
 *          구현부
 *          return 결과값;
 *                 -----
 *        
 *       }
 *       
 *       리턴타입 : 사용자가 요청한 내용을 처리후에 결과값의 데이터형
 *                 1) 결과값이 있는 경우
 *                 2) 결과값이 없는 경우 => void
 *                 리턴타입 / return 값은 항상 일치하지는 않는다
 *                 -----    ------
 *                 항상 리턴타입이 결과값보다는 크거나 같다
 *                     ------   ----
 *                       int    10.5 => 오류
 *                       double   10  => 정상수행
 *                 3) 리턴타입이나 결과값은 1개만 나온다
 *                    ** 여러개일 경우 : 배열, 클래스를 이용한다    
 *                                    ---  ----- 주소 => 얕은 복사
 *                    예) int[] dispaly()
 *                      
 *                      => int[] arr=display()
 *                         int[] ar=new int[5];
 *                         int[] arr2=arr;
 *                         
 *                         class A 
 *                         A dispaly()
 *                         {
 *                           A a=new A();
 *                           return a;
 *                         }
 *                         
 *                         A aa=display() ==> aa=a
 *                         
 *                         리턴형 : 기본형, 배열, 클래스 (사용자 정의 데이터형)
 *                         return int=> 10
 *                                double => 10.5
 *                                char => 'A'
 *                                배열 => 배열명(주소)
 *                                int[] arr=new int[5];
 *                                return arr;
 *                                클래스 => 객체명(주소)
 *                                A a=new A();
 *                                return a;
 *          매개변수 : 사용자 요청값
 *              getView(int page)
 *              findDate(String s) = 사용자가 요청한 값
 *              login(String id, String pwd)
 * 
 */
class Student // int처럼 데이터형으로 쓰임
{
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}

class StudentSystem
{
	/*int getHakbun()
	{
		return 1;
	}
	String getName()
	{
		return "홍길동";
	}
	String getSex()
	{
		return "남자";
	}
	int getkor()
	{
		return 90;
	}
	int getEng()
	{
		return 80;
	}
	int getMath()
	{
		return 70;
	}*/
	Student getData()
	{
		Student s=new Student();
		s.hakbun=2;
		s.name="심청이";
		s.sex="여자";
		s.kor=90;
		s.eng=80;
		s.math=70;
		return s;
	}
	//클래스 == 데이터형
}
public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		StudentSystem ss=new StudentSystem();
//		hong.hakbun=ss.getHakbun();
//		hong.name=ss.getName();
//		hong.sex=ss.getSex();
//		hong.kor=ss.getHakbun();
//		hong.eng=ss.getEng();
//		hong.math=ss.getMath();
		
		Student shim=ss.getData();
		
		
	
	}

}
