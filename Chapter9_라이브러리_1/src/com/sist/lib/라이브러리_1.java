package com.sist.lib;
/*
 *  1. java.lang
 *     Object : 모든 클래스의 상위 클래스 (모든 클래스는 상속을 Object로 받는다)
 *      기능(메소드)
 *      = toString() : 자주 사용이 된다, 객체를 문자열화 시킨다
 *                     => 오버라이딩
 *     = clone() : 객체 복제 => prototype
 *          참조 : 같은 메모리를 이용 (얕은 복사)
 *          복제 : 다른 메모리를 제작 (깊은 복사)
 *     = finalize() : 소멸자 함수 (호출되면 메모리 해제)
 *     = equals() : 객체 비교
 *   String : 문자열 저장하고 관리하는 클래스
 *     기능(메소드) 
 *     = equals() : 문자열을 비교할 때 사용
 *       ==은 주소값을 비교, equals = 주소값안에 있는 값을 비교
 *        로그인 처리, 상세보기 , 아이디 중복체크, 비밀번호 비교 ...
 *     = startsWith : 시작문자열이 같은 경우
 *        => 오라클 : 'A%'
 *        = endswith : 끝나는 문자열이 같은 경우
 *          => 오라클 : '%A'
 *        = contains : 포함된 문자열 (가장 많이 사용) 
 *          => 추천
 *        = replace : 문자나 문자열을 변경할 때
 *        211.238.242.101
 *                    102
 *                    103
 *                    104.. 20
 *        = replaceAll : 문자나 문자열을 변경할 때 (정규식) => 문자열의 형태 (한번에 변경이 가능
 *        [0-9]{1,3}\\.[0-9]{1,3}\\[0-9]{1,3}\\.[0-9]{1,3}
 *        = trim : 좌우의 공백 제거
 *        = split : 특정 단어별로 나눠서 저장 => String[]
 *           => StringTokenizer
 *        = valueOf : 모든 데이터형을 문자열로 변경
 *        = length: 문자의 갯수
 *        = substring: 문자열 자르는 경우에 사용
 *      StringBuffer , StringBuilder ...
 *      Wrapper : 기본형을 클래스
 *       Byte, Integer, Double, Boolean, Float , Long ...
 *      System
 *      Math
 *      Thread
 *      ------------ java.lang은 import를 생략 할 수 있다

 *    
 *     
 *  2. java.util
 *     ***Date/Calendar
 *     ***StringTokenizer
 *     Collection (자료구조) => 메모리상에 있는 데이터를 쉽게 관리
 *        |
 *   ---------------------------
 *   |           |        |
 * **List        Map      Set(interface) => **HashSet/TreeSet
 *   |       **HashMap/Hashtable
 *   **ArrayList
 *  Quene LinkedList
 *   Vector
 *   
 *  2-1. java.text
 *  3.java.io
 *  4.java.net 
 *  5. java.sql
 *  ---------------- 기본 라이브러리
 *  6.javax.xml
 *  7.javax.servlet.http
 *  8.외부 라이브러리 (자바에서 지원하는 것이 아니라 업체)
 *    Open API => Jsoup, simple-json : mvnrepository.com
 *    org.
 *    com.
 *    
 *  -------------- 1. DB (Mybatis, Hibernate(JPA))
 *                 2. XML,JSON(VueJS, Ajax, React)
 *                 3. 프레임워크 : Spring / Spring-Boot / Struts
 *                 *** JSP(HTML=ThymeLeaf)
 *                 현대 => Spring-Boot / React
 *                 삼성 => Spring-Boot / VueJS
 *                 
 *  
 */
class A
{
	int a=10;
	int b=20;	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a="+a+",b="+b;
	}

}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.toString());
		System.out.println(aa);

	}


}
