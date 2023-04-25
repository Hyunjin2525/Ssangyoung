package com.sist.string;
/*
 *   305page
 *     = String : 문자열을 조작하고 처리하는 기능
 *                -----------
 *                = String은 클래스, 일반 데이터형으로 취급
 *                  => 모든 클래스는 Call By Reference, String은 Call By Value
 *                  A a=new A()
 *                  A b=a; ==> 같은 주소를 제어
 *                  String s="Hello";
 *                  String s1=s; ==> s1을 변경하면 s는 변경사항이 없다
 *                = 메모리 할당 (저장)
 *                  = String s="Hello";
 *                  = String s=new String("Hello");
 *                  *** 문자열은 주소 (자체가 주소다)
 *                      => 같은 문자열이면 같은 주소를 가지고 있다
 *                      => new이용해서 생성이 되면 다른 주소에 저장
 */

public class 라이브러리_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Hello";
		// 같은 메모리 주소에 저장
		String s3=new String("Hello");
		String s4=new String("Hello");
		//새로운 메모리에 저장
		//String => 저장은 주소를 저장하고 있다
		//char[] => 쉽게 사용이 가능하게 만들어 준다
		
		if(s1==s3)// 같은 곳에 저장이 되어 있는지 확인 (메모리 주소)
		//new를 사용하면 다른 주소를 가지고 있다
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다");
		}
		// 실제 => 저장된 데이터된 데이터값이 같은지 확인
		// s1에 저장딘 값과 3에 있는 값이 같은지 확인
		if(s1.equals(s3))
		{
			System.out.println("s1과 s3는 같은 값을 가지고 있다");
		}
		else
		{
			System.out.println("s1과 s3는 같지 않다");
		}
		
		
		//308page => 문자열 결합 (+)
		String ss="Hello";
		String ss1="Java";
		String ss2=ss+ss1;
		System.out.println(ss2); // StringBuffer
		
		
		
			
	}

}
