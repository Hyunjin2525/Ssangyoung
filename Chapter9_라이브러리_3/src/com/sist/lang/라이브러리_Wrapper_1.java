package com.sist.lang;
/*
 *  Wrapper : 전체를 감싼다
 *  ------- CSS (container)
 *  프로그램 개발 => 기본형 데이터형을 객체단위로 저장할 때
 *  
 *  List<int> => 오류
 *       ----- 클래스형
 *  List<Integer>
 *  => 기본형을 클래스화 해서 사용
 *     ------------- Wrapper
 *     
 *     기본형        클래스형 => 기본형에 기능을 추가해서 클래스화 시킨것 (Wrapper) 
 *     int          Integer
 *     long         Long
 *     byte         Byte
 *     double       Double
 *     boolean      Boolean
 *   --------------------------
 *     
 *     
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="4.3";
		//double d=(double)s;  //숫자는 문자열로 변경 불가
		double d=Double.parseDouble(s); //변경 가능 방법
		//사용처 => 문자열을 원하는 데이터형으로 변경할 때 주로 사용
		// => 클라이언트에 배포 => 윈도우 / 브라우저 / 핸드폰
		// =========> 모든 데이터형 문자열 => 기본형 데이터으로 변경
		// 외워야 될 것 : 1.클래스명 = 객체 단위로 저장(List<>)
		//             2. 문자열 => 해당 데이터형으로 변환 ==> parseXxxxx =>static
		// 오토박싱 / 언박싱
		/*
		 *   오토박싱
		 *   --Integer i=new Integer(10); = X
		 *   Integer i=10; ==> String s="" ==오토박싱 //클래스에 해당 데이터값을 설정//new를 사용하지 않아도 됨
		 *   int aa=i; = 언박싱 // 기본형에 클래스 객체를 설정
		 */
		Integer i=100;
		System.out.println("i="+i);
		int aa=i;
		System.out.println("aa="+aa);
	
		
		/*
		 * List<Integer> list=new ArrayList<Integer>();
		 *     1. 문자열을 해당 데이터형으로 변환
		 *         문자열 => 정수형 Integer.parseInt("10")
		 *         문자열 => 실수형 Double.parseDouble("4.5")
		 *         문자열 => 논리형 Boolean.parseBoolean("true")
		 *     2. 객체단위로 저장할때가 있다 ***(자료구조 => Collection)
		 */

	}

}
