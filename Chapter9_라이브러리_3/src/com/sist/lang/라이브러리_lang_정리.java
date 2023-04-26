package com.sist.lang;
/*
 *  java.lang => 기본 (가장 많이 사용되는 클래스의 집합)
 *  ----------
 *  Object : 최상위 클래스 => 모든 클래스 Object 상속
 *           ---------- 데이터형으로 사용 (가장 큰 데이터형)
 *             Object o=10
 *             o=10.3
 *             o=""
 *             o='A'
 *             o=true
 *             o=new 클래스()
 *             -------------- 여러개의 데이터형을 묶어서 관리
 *             => 라이브러리에서 제공하는 메소드
 *                -----------------------
 *                리턴형 / 매개변수 ==> 대부분 Object
 *                => 형변환 ==> 제네릭스 (리턴형/매개변수변경)
 *               기본형 = 클래스 => 오토박싱
 *               클래스 = 기본형값 => 언박싱
 *             => 기능
 *             1) clone : 복제(새로운 메모리를 만든다)
 *             2) toString : 객체를 문자열화
 *             3) finalize : 소멸자
 *             4) equals : 비교 (기본 => 주소값, 실제값을 비교 => 오버라이딩)
 *             
 *                           
 *  String : 문자열 저장 클래스
 *  ------ 기능
 *          length()
 *          substring()
 *          trim()
 *          chatAt()
 *          replace()
 *          equals()
 *          startsWith()
 *          contains()
 *          indexOf()
 *          lastIndexOf()
 *          valueOf()
 *          
 *  StringBuffer : append() 문자열 결합
 *  Wrapper
 *     기본형을 클래스화 시킨 클래스 집합
 *     --------------------------
 *     int          ==> Integer
 *     long         ==> Long
 *     double       ==> Double
 *     boolean      ==> Boolean
 *     -------------------------- 기본형을 객체형으로 저장, 문자열을 기본형으로 변환
 *     정수 변경 => Integer.parseInt()
 *     실수 변경 => Double.parseDouble()
 *     논리 변경 => Boolean.parseBoolean()
 *  Math: 수학
 *    = random() : 난수 발생 (0.0~0.99)
 *    = ceil() : 올림메소드
 *    = round() : 반올림메소드 => 평군, 통계
 *  System
 *  =	System.currentTimeMillis() : 실제 시간을 => long
 *       로그파일 => 웹
 *  = System.gc() : 가비지 컬렉션 호출 (메모리 회수)
 *  = System.out : 화면 출력 (outputStream)
 *  = System.in : 키보드 입렵값, 파일 (inputStream)
 *  
 */
import java.util.*;
class A
{
	
}
public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

}
